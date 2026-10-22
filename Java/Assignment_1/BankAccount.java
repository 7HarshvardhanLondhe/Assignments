class BankAccount{
	int accountNumber;
	String holderName;
	int currentBalance;
	int interestRate;
}
class Bank_Test{
 	public static void main(String[] args)
	{
		BankAccount b1=new BankAccount();

		System.out.println(b1.accountNumber);
		System.out.println(b1.holderName);
		System.out.println(b1.currentBalance);
		System.out.println(b1.interestRate);

		b1.accountNumber=101;
		b1.holderName="Harsh";
		b1.currentBalance=5862;
		b1.interestRate=10;

		System.out.println("accountNumber is "+b1.accountNumber);
		System.out.println("holderName is "+b1.holderName);
		System.out.println("currentBalance is "+b1.currentBalance);
		System.out.println("interestRate is "+b1.interestRate);
	}
}
		