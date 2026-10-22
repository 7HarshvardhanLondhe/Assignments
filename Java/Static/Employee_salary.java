
class Employee_salary {
    String name;
    double basicSalary;

    static double bonusRate = 10.0;

    Employee_salary(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    static void updateBonusRate(double newRate) {
        bonusRate = newRate;
    }

    double calculateTotalSalary() {
        return basicSalary + (basicSalary * bonusRate / 100);
    }

    public static void main(String[] args) {
        Employee_salary e1 = new Employee_salary("Rahul", 30000);
        Employee_salary e2 = new Employee_salary("Amit", 40000);

        System.out.println("Employee: " + e1.name);
        System.out.println("Total Salary: Rs. "
                           + e1.calculateTotalSalary());

        System.out.println("Employee: " + e2.name);
        System.out.println("Total Salary: Rs. "
                           + e2.calculateTotalSalary());

        Employee_salary.updateBonusRate(15.0);

        System.out.println("\nAfter updating bonus rate:");

        System.out.println("Rahul's Salary: Rs. "
                           + e1.calculateTotalSalary());

        System.out.println("Amit's Salary: Rs. "
                           + e2.calculateTotalSalary());
    }
}
