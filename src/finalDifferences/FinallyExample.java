package finalDifferences;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Result: " + (10 / number));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("This block will be executed regardless of exception");
            scanner.close();
        }
    }
}
