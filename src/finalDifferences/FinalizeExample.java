package finalDifferences;
import java.util.Scanner;

class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method called: Object about to be garbage collected");
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FinalizeExample obj = new FinalizeExample();
        System.out.println("Object created, press Enter to continue...");
        scanner.nextLine();

        obj = null; // Object becomes eligible for garbage collection
        System.gc(); // Explicitly request garbage collection
        System.out.println("Press Enter to exit...");
        scanner.nextLine();

        scanner.close();
    }
}
