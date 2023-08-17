package inheritance;

import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNumber;

    public void acceptStudentDetails() {
        acceptDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }

    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter student details:");
        student.acceptStudentDetails();

        System.out.println("\nStudent details:");
        student.displayStudentDetails();
    }
}
