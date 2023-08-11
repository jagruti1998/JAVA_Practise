import constructor.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        // Using constructor with name and age parameters
        Student student1 = new Student(name, age);
        student1.display();

        // Using constructor with name parameter
        Student student2 = new Student(name);
        student2.display();

        // Using default constructor
        Student student3 = new Student();
        student3.display();

        scanner.close();
    }

}