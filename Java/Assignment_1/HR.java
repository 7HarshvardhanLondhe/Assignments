class HR{
	int id;
	String name;
	double salary;
	double commission;
}
class Test{
	public static void main(String[] args)
	{
		HR h1;
		h1=new HR();
		System.out.println(h1.id);
		System.out.println(h1.name);
		System.out.println(h1.salary);
		System.out.println(h1.commission);

		h1.id=10;
		h1.name="Ram";
		h1.salary=1556320;
		h1.commission=222245;

		System.out.println("HR id is "+h1.id);
		System.out.println("HR name is "+h1.name);
		System.out.println("HR salary is "+h1.salary);
		System.out.println("HR commission is "+h1.commission);
	}
}