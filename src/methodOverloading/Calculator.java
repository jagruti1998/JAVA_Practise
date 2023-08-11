package methodOverloading;
import java.util.Scanner;

public class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        System.out.print("Enter two integers (separated by space): ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println("Sum of two integers: " + calculator.add(int1, int2));

        System.out.print("Enter two doubles (separated by space): ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        System.out.println("Sum of two doubles: " + calculator.add(double1, double2));

        System.out.print("Enter three integers (separated by space): ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();

        System.out.println("Sum of three integers: " + calculator.add(int3, int4, int5));

        scanner.close();
    }
}
