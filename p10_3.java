import java.lang.Math;

// Figura
abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double perimeter();
    public abstract double area();
}

// Triángulo
class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

// Círculo
class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Rectángulo
class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Hexágono
class Hexagon extends Figure {
    private double side;

    public Hexagon(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}

// Main
public class Main {
    public static void demonstratePolymorphism(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println("Color: " + figure.getColor());
            System.out.println("Perimeter: " + figure.perimeter());
            System.out.println("Area: " + figure.area());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Figure triangle = new Triangle("Red", 3, 4, 5);
        Figure circle = new Circle("Blue", 7);
        Figure rectangle = new Rectangle("Green", 5, 10);
        Figure hexagon = new Hexagon("Yellow", 6);

        Figure[] figures = {triangle, circle, rectangle, hexagon};

        demonstratePolymorphism(figures);
    }
}
