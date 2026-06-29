package java_pract1;

public class Java_pract1 {
    Java_pract1(){
        System.out.println("Default Constructor is Called !");
    }
    Java_pract1(String name){
        System.out.println("\nConstructor with ONE parameter is called !");
        System.out.println("Name : " + name);
}
    Java_pract1(String name, int age){
        System.out.println("\nConstructor with TWO parameter is called !");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    int add(int a, int b){
        System.out.println("\nMethod with TWO variable of same datatype is called !");
        return a + b;
    }
    int add(String a, int b){
        System.out.println("\nMethod with TWO variable but DIFFERENT datatype is called !");
        System.out.println("Name : " + a);
        return b;
    }
    int add(int a, int b, int c){
        System.out.println("\nMethod with THREE variable and same datatype is called !");
        return a + b + c;
    }
    public static void main(String[] args) {
        Java_pract1 obj = new Java_pract1();
        new Java_pract1("Om Wala");
        new Java_pract1("Om Wala", 18);
        
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add("Om Wala", 18));
        System.out.println(obj.add(10, 20, 30));
    }
    
}
