package finalDifferences;
import java.util.Scanner;

public class FinalExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        final int constantValue = scanner.nextInt();

        // The value of constantValue cannot be changed
        System.out.println("Constant value: " + constantValue);

        scanner.close();
    }
}
