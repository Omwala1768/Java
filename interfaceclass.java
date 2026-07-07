interface ArithmeticTasks {
    double sum(double x, double y);
    double difference(double x, double y);
    double product(double x, double y);
    double quotient(double x, double y);
}
class BasicCalculator implements ArithmeticTasks {
    @Override
    public double sum(double x, double y) {
        return x + y;
    }

    @Override
    public double difference(double x, double y) {
        return x - y;
    }

    @Override
    public double product(double x, double y) {
        return x * y;
    }

    @Override
    public double quotient(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return x / y;
    }
}
public class interfaceclass {
    public static void main(String[] args) {
        ArithmeticTasks operation = new BasicCalculator();

        System.out.println("Sum = " + operation.sum(20, 8));
        System.out.println("Difference = " + operation.difference(20, 8));
        System.out.println("Product = " + operation.product(20, 8));
        System.out.println("Quotient = " + operation.quotient(20, 8));
    }
}
