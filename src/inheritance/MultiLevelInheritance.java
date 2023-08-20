package inheritance;
import java.util.Scanner;

public class MultiLevelInheritance {
    static class Animal {
        String species;

        void setSpecies(String species) {
            this.species = species;
        }

        void displayInfo() {
            System.out.println("Animal species: " + species);
        }
    }

    static class Mammal extends Animal {
        int numberOfLegs;

        void setNumberOfLegs(int legs) {
            this.numberOfLegs = legs;
        }

        void displayInfo() {
            super.displayInfo();
            System.out.println("Number of legs: " + numberOfLegs);
        }
    }

    static class Dog extends Mammal {
        String name;

        void setName(String name) {
            this.name = name;
        }

        void displayInfo() {
            super.displayInfo();
            System.out.println("Dog name: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Animal class
        System.out.print("Enter the animal species: ");
        String species = scanner.nextLine();

        Animal animal = new Animal();
        animal.setSpecies(species);

        // Taking input for Mammal class
        System.out.print("Enter the number of legs for the mammal: ");
        int legs = scanner.nextInt();

        Mammal mammal = new Mammal();
        mammal.setNumberOfLegs(legs);

        // Taking input for Dog class
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the dog's name: ");
        String name = scanner.nextLine();

        Dog dog = new Dog();
        dog.setName(name);

        // Display information about the animal, mammal, and dog
        System.out.println("\nAnimal Information:");
        animal.displayInfo();

        System.out.println("\nMammal Information:");
        mammal.displayInfo();

        System.out.println("\nDog Information:");
        dog.displayInfo();

        scanner.close();
    }
}
