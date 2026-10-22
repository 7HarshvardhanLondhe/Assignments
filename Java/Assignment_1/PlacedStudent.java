class PlacedStudent{
	int frn;
	String student_name;
	double distance_covered;
	String company_name;
	String designation;
}
class Test{
	public static void main(String[] args)
	{
		PlacedStudent p1=new PlacedStudent();
		System.out.println(p1.frn);
		System.out.println(p1.student_name);
		System.out.println(p1.distance_covered);
		System.out.println(p1.company_name);
		System.out.println(p1.designation);
		p1.frn=101;
		p1.student_name="Ram";
		p1.distance_covered=10.2;
		p1.company_name="Marvellour";
		p1.designation="BTech";

		System.out.println("student frn is "+p1.frn);
		System.out.println("student name is "+p1.student_name);
		System.out.println("distance covers "+p1.distance_covered);
		System.out.println("student company name is "+p1.company_name);
		System.out.println("student designationis "+p1.designation);
	}
}	