package Trainingdaythree;

public class DayScholar extends Student 
{
	String residentialAddress;//instance variabke
	Student sr;
	DayScholar()
	{
		
	}
	DayScholar(Student sr,String rs)//local variable
	{
		this.sr =sr;
		residentialAddress = rs;
	}

	public String getResidentialAddress()
	{
		return residentialAddress;
	}
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println(residentialAddress);
		//System.out.println("Residential address" +new Day)
		
	}
	public static void main(String[] args)
	{
		DayScholar ds =new DayScholar(new Student(),"Dallas");
		ds.displayStudentDetails();
		
	}
}
