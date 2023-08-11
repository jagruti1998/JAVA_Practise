package constructor;
import java.util.Scanner;

//Constructor chaining
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
}

