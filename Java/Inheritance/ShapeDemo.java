
class Shape {
    protected double area;

    void display() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        area = length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(10, 4);

        c.calculateArea();
        t.calculateArea();
        r.calculateArea();

        System.out.print("Circle ");
        c.display();

        System.out.print("Triangle ");
        t.display();

        System.out.print("Rectangle ");
        r.display();
    }
}
