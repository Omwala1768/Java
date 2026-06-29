package java_pract1;
class Father{
    void display(){
        System.out.println("Practical 1B Inheritance and method overriding");
}
}
class Son extends Father{
    @Override
    void display(){
        System.out.println("Om wala F122");
    }
}
public class Pract1b {
    public static void main(String[] args){
        Son s = new Son();
        s.display();
    }
}


