package Training;

import java.util.Scanner;
//import java.util.Set;

public class Student 
{
	int studentid;
	char studentType;
	String studentname;
	int fees;
	Student()
	{
		studentid=17;
		studentType='F';
	}
	
	public void setstudentid(int id)
	{
		studentid = id;
		
	}
	public int getstudentid()
	{
		return studentid;
		
	}
	public void setfees(int id)
	{
		fees = id;
		
	}
	public int getfees()
	{
		return fees;
		
	}
	public void setstudentname(String s)
	{
		studentname = s;
		
	}
	public String getstudentname()
	{
		return studentname;
		
	}
	public void setstudentType(char studentType)
	{
		this.studentType =studentType;
	}
	public char getstudentType()
	{
		return studentType;
		
	}
	public static void main(String[] args)
	{
		Student student = new Student();
		System.out.println("Student id");
		Scanner sc = new Scanner(System.in);
		
				
				
		int id = sc.nextInt();
		student.setstudentid(id);
		
		//System.out.println("Student  name is");
		//Scanner sc1 = new Scanner(System.in);
		//String s = sc.nextLine();
		//student.setstudentname(s);
		System.out.println("Student id is" +student.getstudentid() );
		System.out.println("Student fees is");
		int fees = sc.nextInt();
		student.setfees(fees);
		System.out.println("Fees"+student.getfees());
		//System.out.println("Student name is"+student.getstudentname());;
	}

}
