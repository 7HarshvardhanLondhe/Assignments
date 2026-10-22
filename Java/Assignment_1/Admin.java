class Admin{
	int id;
	String name;
	double salary;
	int allowance;
}
class Test{
	public static void main(String[] args)
	{
		Admin a1=new Admin();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.salary);
		System.out.println(a1.allowance);


		a1.id=101;
		a1.name="Raj";
		a1.salary=10000;
		a1.allowance=500;
		

		System.out.println("Admin id is "+a1.id);
		System.out.println("Admin name is "+a1.name);
		System.out.println("Admin salary is "+a1.salary);
		System.out.println("Admin allowance is "+a1.allowance);
	}
}