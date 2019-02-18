package Trainingdaythree;

public class Student
{
	int studentId;
	char studentType;
	String studentName;
	double feesPerMonth;
	
	Student()
	{
		
	}
	Student(int id,char type, String firstName, String lastName )
	{
		studentId= id;
		studentType = type;
		firstName=firstName;
		lastName = lastName;
	}
	public void setStudentId(int id)
	{
		studentId =id;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentType(char ch)
	{
		studentType =ch;
	}
	public char getStudentType()
	{
		return studentType;
	}
	public void setStudentName(String firstname,String lastname)
	{
		studentName =firstname+lastname;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setFeesperMonth(double d)
	{
		feesPerMonth =d;
	}
	public double getFeespermonth()
	{
		return feesPerMonth;
	}
	void displayStudentDetails()
	{
		Student s = new Student();
		s.setStudentId(12);
		s.setStudentType('F');
		s.setStudentName("ronish", "panjwanu");
		s.setFeesperMonth(20000);;
		System.out.println("Student details are as follows==");
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentType());
		System.out.println(s.getStudentName());
		System.out.println(s.getFeespermonth());
	}
}
