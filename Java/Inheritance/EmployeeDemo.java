
class Employee {
    protected int id;
    protected String name;
    protected double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Admin extends Employee {
    private double allowance;

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void display() {
        super.display();
        System.out.println("Allowance: " + allowance);
    }
}

class SalesManager extends Employee {
    private double incentive;
    private int target;

    SalesManager(int id, String name, double salary,
                 double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void display() {
        super.display();
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee {
    private double commission;

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    void display() {
        super.display();
        System.out.println("Commission: " + commission);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Admin a = new Admin(101, "Rahul", 30000, 5000);
        a = new SalesManager(102, "Amit", 40000, 8000, 100);
        a = new HR(103, "Priya", 35000, 3000);

        System.out.println(a.getName());

        // System.out.println("Admin Details:");
        // a.display();

        // System.out.println("\nSales Manager Details:");
        // s.display();

        // System.out.println("\nHR Details:");
        // h.display();
    }
}
