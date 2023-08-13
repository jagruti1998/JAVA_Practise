package encapsulation;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {

        this.name = name;
    }

    // Getter for name
    public String getName() {

        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age set to 0.");
            this.age = 0;
        }
    }

    // Getter for age
    public int getAge() {

        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());

        scanner.close();
    }
}
