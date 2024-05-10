
import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();

    public double calculateVolume() {
        return 0; // By default, shapes are flat and have no volume
    }
}

class Triangle extends Shape {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Sphere extends Shape {
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Cube extends Shape {
    public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter base and height of triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            case 2:
                System.out.println("Enter radius of circle:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.println("Enter length and breadth of rectangle:");
                double length = scanner.nextDouble();
                double breadth = scanner.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 4:
                System.out.println("Enter radius of sphere:");
                radius = scanner.nextDouble();
                shape = new Sphere(radius);
                break;
            case 5:
                System.out.println("Enter side of cube:");
                double side = scanner.nextDouble();
                shape = new Cube(side);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (shape != null) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Volume: " + shape.calculateVolume()); // Only for 3D shapes
        }
    }
}