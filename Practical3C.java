package practical3a;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidGoalsException extends Exception {
    InvalidGoalsException(String message) {
        super(message);
    }
}

public class Practical3C {

    static void checkPlayer(int age, int goals)
            throws InvalidAgeException, InvalidGoalsException {

        if (age <= 0) {
            throw new InvalidAgeException("Age cannot be zero or negative.");
        }

        if (age < 10) {
            throw new InvalidAgeException("Age below 10 is not allowed.");
        }

        if (age > 50) {
            throw new InvalidAgeException("Age above 50 is not allowed.");
        }

        if (goals < 0) {
            throw new InvalidGoalsException("Goals cannot be negative.");
        }

        if (goals > 1000) {
            throw new InvalidGoalsException("Goals above 1000 are not possible.");
        }
        System.out.println("Om Wala S119");
        System.out.println("\nFootball Player Details Accepted!");
        System.out.println("Age : " + age);
        System.out.println("Goals Scored : " + goals);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Goals Scored: ");
        int goals = sc.nextInt();

        try {
            checkPlayer(age, goals);
        }
        catch (InvalidAgeException | InvalidGoalsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
