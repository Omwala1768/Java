package practical3a;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class ExceptionDemo {
    public void performTask(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        } 
        else if (value > 100) {
            throw new CustomException("Value cannot exceed 100");
        }
        else {
            System.out.println("Task performed successfully");
        }
    }
}

public class Practical3B {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.performTask(50);
            demo.performTask(110);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        try {
            demo.performTask(-120);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
