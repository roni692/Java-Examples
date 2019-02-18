package Trainingdaythree;

public class studentthree 
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	int feesPerMonth;
	int semesterFees =12000;
	public void setStudentId(int id)
	{
		studentId=id;
	}

	public void setStudentType(char Type)
	{
		studentType = Type;
	}
	public void setStudentName(String firstname,String lastname)
	{
		studentName = firstname+lastname;
		//this.firstname =firstname;
	}
	//public void setStudentName(String name)
	//{
		//studentName = name;
	//}
	public final void getDetails()
	{
		System.out.println("Student Id " +studentId);
		System.out.println("Student Name " +studentName);
		System.out.println("Student Id " +studentType);
	}
	public void calculatFees()
	{
		feesPerMonth =(int) (semesterFees/6.0); 
		System.out.println("Fees per sem " +feesPerMonth);
	}

}
