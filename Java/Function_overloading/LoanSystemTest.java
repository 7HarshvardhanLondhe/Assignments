class Student {
    int rollNo;
    String name;
    double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }
}

class Employee {
    int id;
    String name;
    double annualSalary; 

    public Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}

class Bank {
    
    public void approveLoan(Student s) {
        System.out.println("Processing Loan for Student: " + s.name + " (" + s.percentage + "%)");
        if (s.percentage > 80) {
            System.out.println("Loan Approved: RS 2,00,000\n");
        } else if (s.percentage >= 60) {
            System.out.println("Loan Approved: RS 1,00,000\n");
        } else if (s.percentage >= 40) {
            System.out.println("Loan Approved: RS 50,000\n");
        } else {
            System.out.println("No loan approved (Percentage below 40%).\n");
        }
    }

    
    public void approveLoan(Employee e) {
        System.out.println("Processing Loan for Employee: " + e.name + " (" + e.annualSalary + " LPA)");
        if (e.annualSalary > 12) {
            System.out.println("Loan Approved: RS 7,00,000\n");
        } else if (e.annualSalary >= 10) {
            System.out.println("Loan Approved: RS 6,00,000\n");
        } else if (e.annualSalary >= 6) {
            System.out.println("Loan Approved: RS 5,00,000\n");
        } else if (e.annualSalary >= 4) {
            System.out.println("Loan Approved: RS 4,00,000\n");
        } else {
            System.out.println("No loan approved (Salary below 4 LPA).\n");
        }
    }
}

public class LoanSystemTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        Student s1 = new Student(101, "Alice", 85.5);
        Student s2 = new Student(102, "Bob", 55.0);
        
        Employee e1 = new Employee(201, "Charlie", 11.5);
        Employee e2 = new Employee(202, "Diana", 3.5);
        
        System.out.println("--- Loan Approval System ---");
        bank.approveLoan(s1);
        bank.approveLoan(s2);
        bank.approveLoan(e1);
        bank.approveLoan(e2);
    }
}