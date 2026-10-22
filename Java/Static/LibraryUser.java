
class LibraryUser {
    String userName;
    int daysLate;

    static double finePerDay = 5.0;

    LibraryUser(String userName, int daysLate) {
        this.userName = userName;
        this.daysLate = daysLate;
    }

    double calculateFine() {
        return daysLate * finePerDay;
    }

    public static void main(String[] args) {
        LibraryUser u1 = new LibraryUser("Rahul", 4);
        LibraryUser u2 = new LibraryUser("Amit", 7);

        System.out.println("User: " + u1.userName);
        System.out.println("Days Late: " + u1.daysLate);
        System.out.println("Total Fine: Rs. " + u1.calculateFine());

        System.out.println("\nUser: " + u2.userName);
        System.out.println("Days Late: " + u2.daysLate);
        System.out.println("Total Fine: Rs. " + u2.calculateFine());
    }
}
