package TrainingDaytwo;

import java.util.Scanner;

//import Training.Student;

public class studentt 
{
	String studentName;
	String ResidentialStatus;
	int age;
	//int asIntage;
	public static void main(String[] args)
	{
		studentt student = new studentt();
		System.out.println("Enter Student name :");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			if(sc.hasNextLine())
			{	
				String name = sc.nextLine();
				String status = sc.nextLine();
				//int ageAsInt = sc.nextInt(); 
				student.setstudentName(name);
				student.setResidentialStatus(status);
				System.out.println("Student Name is :"+student.getstudentName());
				System.out.println("Residential Status :"+student.getResidentialStatus());
			}
			else
			{
				int age = sc.nextInt();
				student.setage(age);
				System.out.println("age is"+student.getage());
			}	
		}
			
		
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
	public void setResidentialStatus(String sr)
	{
		ResidentialStatus = sr;
	}
	public String getResidentialStatus()
	{
		return ResidentialStatus;
	}
	
}
/*public static void Data(Scanner sc)
{
	studentt studentt = new studentt();
	
		String name;
		String residentialaddress;
		String fees;
		String studentid;
		int feesAsInt;
		int studentIdasInt;
		System.out.println("Enter student name: ");
        name = sc.nextLine();
        studentt.setstudentName(name);
        System.out.println(studentt.getstudentName());
        //System.out.println("Enter residential address : ");
        //sr = sc.nextLine();
        //age = sc.nextLine();
        //ageAsInt = Integer.parseInt(age);
       
}*/