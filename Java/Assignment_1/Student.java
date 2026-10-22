class Student{
	int frn;
	String student_name;
	float dist_covered;
}
class Test{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.frn=101;
		s1.student_name="Sham";
		s1.dist_covered=10;
		System.out.println(s1.frn);
		System.out.println("student frn: "+s1.frn);
		System.out.println("Student name: "+s1.student_name);
		System.out.println("Distance covered: "+s1.dist_covered);	
	}
}