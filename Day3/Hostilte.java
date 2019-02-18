package Trainingdaythree;

public class Hostilte extends Student 
{
	private String hostelName;
	private int roomNumber;
	Student stu;
	
	Hostilte()
	{
		
	}
	Hostilte(Student stu,String HName,int rnumber)
	{
		this.stu=stu;
		//feesPerMonth = feesPerMonth;
		hostelName =HName;
		roomNumber = rnumber;
		
		
	}
	
	public String getHostelName()
	{
		return hostelName;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	void displayStudentDetails()
	{

		super.displayStudentDetails();
		Hostilte h =new Hostilte( stu,"SanJose", 101);
		
	
		System.out.println(h.getHostelName());
		System.out.println(h.getRoomNumber());
	}
	public static void main(String[] args)
	{
		Hostilte h =new Hostilte();
		h.displayStudentDetails();
		
		
		
	}

}
