package abstraction;
import java.util.Scanner;

// Abstract class representing a Shape
abstract class Shape {
    abstract double calculateArea();
}

// Concrete subclass representing a Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        Circle circle = new Circle(circleRadius);
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Area of the rectangle: " + rectangleArea);

        scanner.close();
    }
}
