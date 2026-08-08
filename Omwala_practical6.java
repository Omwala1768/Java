package omwala_practical6;
import org.json.JSONObject;

public class Omwala_practical6 {
    static class person{
        String name;
        int age;
        String email;
        
        person(String name, int age, String email){
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }
    
    public static void main(String[] args) {
        person person = new person("Om Wala", 18, "om@gmail.com");
        
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", person.name);
        jsonObject.put("age", person.age);
        jsonObject.put("email", person.email);
        
        System.out.println("Om Wala S119");
        System.out.println("Encoded Json : ");
        System.out.println(jsonObject.toString(2));
        
        String jsonString = jsonObject.toString();
        JSONObject parsed = new JSONObject(jsonString);
        
        String name = parsed.getString("name");
        int age = parsed.getInt("age");
        String email = parsed.getString("email");
        
        person decodedperson = new person(name , age , email);
        System.out.println("\nDecoded Person Object : ");
        System.out.println("Name : " + decodedperson.name);
        System.out.println("Age : " + decodedperson.age);
        System.out.println("Email : " + decodedperson.email);
    }
    
}
