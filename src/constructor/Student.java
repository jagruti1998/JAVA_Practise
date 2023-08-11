package constructor;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    // Constructor with no parameters
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with name parameter
    public Student(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor with name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


