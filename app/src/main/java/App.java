import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public double calculateNumbers(double a, double b, double c, double d) {
        if (c + d == 0) {
            throw new IllegalArgumentException("Please make sure c + d is not zero.");
        }

        return (a + b) / (c + d);
    }

    public static void main(String[] args) {
        try {
            var scanner = new Scanner(System.in);
    
            System.out.println("Enter a:");
            double a = readInput(scanner, 'a');
    
            System.out.println("Enter b:");
            double b = readInput(scanner, 'b');
    
            System.out.println("Enter c:");
            double c = readInput(scanner, 'c');
    
            System.out.println("Enter d:");
            double d = readInput(scanner, 'd');
    
            scanner.close();

            var app = new App();
            System.out.println("Result: " + app.calculateNumbers(a, b, c, d));
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static double readInput(Scanner scanner, char type) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a real number.");
                System.out.println("Enter " + type + ":");
            }
        }
    }
}
