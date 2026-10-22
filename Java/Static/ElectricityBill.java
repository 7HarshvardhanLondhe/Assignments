
class ElectricityBill {
    static double ratePerUnit = 8.0;

    String customerName;
    int unitsConsumed;

    ElectricityBill(String customerName, int unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    static void updateRate(double newRate) {
        ratePerUnit = newRate;
    }

    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill("Rahul", 100);
        ElectricityBill e2 = new ElectricityBill("Amit", 150);

        System.out.println("Customer: " + e1.customerName);
        System.out.println("Bill Amount: Rs. " + e1.calculateBill());

        System.out.println("Customer: " + e2.customerName);
        System.out.println("Bill Amount: Rs. " + e2.calculateBill());

        ElectricityBill.updateRate(10.0);

        System.out.println("\nAfter updating rate:");

        System.out.println("Rahul's Bill: Rs. " + e1.calculateBill());
        System.out.println("Amit's Bill: Rs. " + e2.calculateBill());
    }
}
