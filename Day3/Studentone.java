package Trainingdaythree;

public class Studentone extends CourseRegistration
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	private int feesPerMonth;
	Studentone(int studentId, String cname)
	{
		super(cname);
		this.studentId = studentId;
		
	}
	Studentone(int studentId,char studentType,String studentName, int semfee, String cname)
	{
		super(cname);
		this.studentId = studentId;
		this.studentName = studentName;
		semesterFees = semfee;
	}
}
