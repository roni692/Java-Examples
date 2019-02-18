package TrainingDaytwo;

import java.util.Scanner;

//import Training.Student;

public class studentt 
{
	int studentId;
	char studentType;
	String studentName;
	String ResidentialStatus;
	int age;
	long feesPerMonth;
	
	public static void main(String[] args)
	{
		studentt student = new studentt();
		System.out.println("Enter Student name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		student.setstudentName(name);
		System.out.println("Enter residential address");
		//String status = sc.nextLine();
		//student.setResidentialStatus(status);
		String status1 = student.setResidentialStatus("hostilite");
		System.out.println("Enter Student age");
		int age = sc.nextInt(); 
		student.setage(age);
		//System.out.println("Student fees is");
		//long fees = sc.nextLong();
		System.out.println("Student Name is :"+student.getstudentName());
		System.out.println("Residential Status :"+student.getResidentialStatus());
		System.out.println("Stduent age :"+student.getage());
		System.out.println("Student Fees: "+student.getfeesPerMonth());
		
	}	
	public  void setage(int a)
	{
		age = a;
	}
	public int getage()
	{
		return age;
	}
	public  void setstudentName(String s)
	{
		studentName = s;
	}
	public String getstudentName()
	{
		return studentName;
	}
	//public void setResidentialStatus(String sr)
	//{
		
		//	String sr ="Daylite";
		//ResidentialStatus = sr;
	//}
	//public String getResidentialStatus()
	//{
		//return ResidentialStatus;
	//}
	public String setResidentialStatus(String sr)
	{
		Status1 =sr;
		return "status1";
		//String sr ="Daylite";
		//ResidentialStatus = sr;
	}
	public String getResidentialStatus()
	{
		return status1;
	}
	
	
	public long getfeesPerMonth()
	{
		return 200000;
	}
	void calculateFees(double semesterFees)
	{
		feesPerMonth = (long) (semesterFees/6.0);
		System.out.println("Student fees without hostel"+feesPerMonth);
		
	}
	void calculateFees(double semesterFees, double hostelFees)
	{
		feesPerMonth = (long)(semesterFees/6.0);
		feesPerMonth =(long)(feesPerMonth + hostelFees);
		System.out.println("Student fees with hostel"+feesPerMonth);
		
	}
}
