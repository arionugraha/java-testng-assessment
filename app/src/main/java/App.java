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
            double a = scanner.nextDouble();
    
            System.out.println("Enter b:");
            double b = scanner.nextDouble();
    
            System.out.println("Enter c:");
            double c = scanner.nextDouble();
    
            System.out.println("Enter d:");
            double d = scanner.nextDouble();
    
            scanner.close();

            var app = new App();
            System.out.println("Result: " + app.calculateNumbers(a, b, c, d));
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter real numbers.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
