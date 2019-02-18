package Trainingdaythree;

public class CourseRegistration 
{
	static protected int regId;//instance varaiable
	protected String courseName;
	CourseRegistration()
	{
		regId++;//local variable
	}
	CourseRegistration(String cname)//local variable
	{
		this();
		courseName =cname;
		
	}
	public void displayDetails()
	{
		System.out.println("Registration ID:" +regId);
		System.out.println("CourseName  +cname");
	}

}
