abstract class mainclass {
    abstract double calculate(double a, double b);
    
    void output(String operation, double result){
        System.out.println(operation + "Result : " + result);
    }
    
}
class add extends mainclass{
    @Override
    double calculate(double a, double b){
        return a + b;
    }
}
class sub extends mainclass{
    @Override
    double calculate(double a, double b){
        return a - b;
    }
}
class mul extends mainclass{
    @Override
    double calculate(double a, double b){
        return a * b;
    }
}
class div extends mainclass{
    @Override
    double calculate(double a, double b){
        if(b==0){
            throw new ArithmeticException("Cannot be divided by 0");
        }
        return a / b;
    }
}
public class abstractclass{
    public static void main(String[] args){
        mainclass add = new add();
        mainclass sub = new sub();
        mainclass mul = new mul();
        mainclass div = new div();
        
        double a=70,b=10;
        add.output("Addition : ", add.calculate(a,b));
        sub.output("Subtractin : ", sub.calculate(a,b));
        mul.output("Multiplication : ", mul.calculate(a,b));
        div.output("Division : ", div.calculate(a,b));
    }
}

