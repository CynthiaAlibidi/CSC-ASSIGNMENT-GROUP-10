import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();

    public double calculateVolume() {
        return 0; // By default, assume no volume for flat shapes
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

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
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

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
    private double radius;

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
    private double side;

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
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            case 2:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = scanner.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 4:
                System.out.print("Enter radius of sphere: ");
                radius = scanner.nextDouble();
                shape = new Sphere(radius);
                break;
            case 5:
                System.out.print("Enter side of cube: ");
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