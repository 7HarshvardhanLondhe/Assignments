class SalesManager{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
}
class Test{
	public static void main(String[] args)
	{
		SalesManager m1=new SalesManager();
		System.out.println(m1.id);
		System.out.println(m1.name);
		System.out.println(m1.salary);
		System.out.println(m1.incentive);
		System.out.println(m1.target);

		m1.id=1001;
		m1.name="Shamrao";
		m1.salary=10000;
		m1.incentive=500;
		m1.target=90;

		System.out.println("student frn is "+m1.id);
		System.out.println("student frn is "+m1.name);
		System.out.println("student frn is "+m1.salary);
		System.out.println("student frn is "+m1.incentive);
		System.out.println("student frn is "+m1.target);
	}
}