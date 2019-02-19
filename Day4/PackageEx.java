package courseregistration;

class Student 
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int sid)
	{
		this.studentId =sid;
	}
	public void setStudentType(char type)
	{
		this.studentType =type;
		
	}
	public void setStudentName(String name)
	{
		this.studentName =name;
		
	}
	public void getDetails()
	{
		System.out.println("Student Id" +studentId);
		System.out.println("Student Id" +studentType);
		System.out.println("Student Id" +studentName);
	}
}

public class PackageEx 
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentType('D');
		student.setStudentName("Thomas");
		student.getDetails();
	}

}

