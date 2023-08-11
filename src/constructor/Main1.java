package constructor;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person name: ");
        String name = scanner.nextLine();

        System.out.print("Enter person age: ");
        int age = scanner.nextInt();

        // Create an instance using parameterized constructor
        Person person = new Person(name, age);
        person.display();

        scanner.close();
    }
}
