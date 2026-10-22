class Triangle {
    double base, height, area;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

class Rectangle {
    double length, breadth, area;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Circle {
    double radius, area;
    
    public Circle(double radius) {
        this.radius = radius;
    }
}

public class Area_Calculator {
    
    public void calculateArea(Triangle t) {
        t.area = 0.5 * t.base * t.height;
        System.out.println("Triangle Area: " + t.area);
    }

    
    public void calculateArea(Rectangle r) {
        r.area = r.length * r.breadth;
        System.out.println("Rectangle Area: " + r.area);
    }

   
    public void calculateArea(Circle c) {
        c.area = Math.PI * c.radius * c.radius;
        System.out.println("Circle Area: " + c.area);
    }
}

class AreaTest {
    public static void main(String[] args) {
        Area_Calculator calculator = new Area_Calculator();
        
        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(6, 4);
        Circle c = new Circle(7);
        
        System.out.println("--- Area Calculation System ---");
        calculator.calculateArea(t);
        calculator.calculateArea(r);
        calculator.calculateArea(c);
    }
}