class Employee{
	int id;
	String name;
	double salary;
}
class Test{
	public static void main(String[] args){
		Employee d1;
		d1=new Employee();
		d1.id=30;
		d1.name="Sham";
		d1.salary=2026000;
		System.out.println("Employee id: "+d1.id);
		System.out.println("Employee name: "+d1.name);
		System.out.println("Employee salary: "+d1.salary);

	}
}