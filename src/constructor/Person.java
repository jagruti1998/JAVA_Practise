package constructor;
import java.util.Scanner;

// Constructor chaining
public class Person {
    private String name;
    private int age;

    // Default constructor
    Person() {
        this("Unknown"); // Call parameterized constructor with a default name
    }

    // Parameterized constructor with name
    Person(String name) {
        this(name, 0); // Call parameterized constructor with a default age
    }

    // Parameterized constructor with name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

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
