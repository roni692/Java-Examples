package Trainingdaythree;

public class Dayscholars extends Studentone
{
	private String residentialAddress;
//Dayscholars(int studentId, char studentType, String studentName,int semfee,String residentialAddress, String cname)
	Dayscholars(int studentId, char studentType, String studentName,int semfee,String residentialAddress, String cname)
{
		
super(studentId, studentType, studentName, semfee, cname);
this.residentialAddress =residentialAddress;
		
}
public void displayDetails()
{
	System.out.println("Student id is "+studentId); 
	System.out.println("Student type is "+studentType); 
	System.out.println("Student NAme is "+studentName); 
	System.out.println("Student Semester Fee is "+semesterFees); 
	System.out.println("Residential Address is "+this.residentialAddress);
	System.out.println("Student Course name is "+super.courseName);
	
			
}

	public static void main(String[] args)
	{
		Dayscholars dayscholar =new Dayscholars
		(1001,'D',"Eugene",12000,"No32/68 Vijaynagar","OOP");
		dayscholar.displayDetails();

	}
}
