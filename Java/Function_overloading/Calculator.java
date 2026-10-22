class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double add(int a, double b) {
        return a + b;
    }
    
    public double add(double a, int b) {
        return a + b;
    }

 
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double subtract(int a, double b) {
        return a - b;
    }
    
    public double subtract(double a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double multiply(int a, double b) {
        return a * b;
    }
    
    public double multiply(double a, int b) {
        return a * b;
    }


    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (double) a / b;
    }
    
    public double divide(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
    
    public double divide(int a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
    
    public double divide(double a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

class Cal_test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("--- Calculator Operations ---");
        System.out.println("Add (int, int): " + calc.add(10, 20));
        System.out.println("Add (double, double): " + calc.add(5.5, 4.5));
        System.out.println("Subtract (double, int): " + calc.subtract(10.5, 3));
        System.out.println("Multiply (int, double): " + calc.multiply(4, 2.5));
        System.out.println("Divide (int, int): " + calc.divide(20, 4));
    }
}