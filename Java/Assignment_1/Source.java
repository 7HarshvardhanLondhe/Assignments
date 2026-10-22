class Date{
	int day;
	int month;
	int year;
	String dow;
}
class Test{
	public static void main(String[] args){
		Date d1;
		d1=new Date();
		d1.day=30;
		d1.month=9;
		d1.year=2026;
		d1.dow="Wednesday";
		System.out.println("Day is: "+d1.day);
		System.out.println("Month is: "+d1.month);
		System.out.println("Year is: "+d1.year);
		System.out.println("Day of week is: "+d1.dow);
	}
}