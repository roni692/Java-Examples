package Trainingdaythree;

public class Dayscholarone extends PostGradStudent
{
	private String residentialAddress;
	
	Dayscholarone(int pid, String pName, int pcfees,int Sid,char Stype,String Sname,String residentialAddres)
	{
		super(pid, pName,pcfees,Sid,Stype,Sname);
		this.residentialAddress=residentialAddress;
	}
	
	public int getFees()
	{
		return super.postCoursefees;
	}
	void calculateFees()
	{
		
		int x = getFees();
		System.out.println("Fee of student is "+x);//dayscholar.super
		//System.out.println("Fess"+dayscholar.getFees());
	}
	
	public static void main(String[] args)
	{
		Dayscholarone dayscholar = new Dayscholarone(10,"Core Java",17000,120,'P',"Mahendra Bahubali","VijayNagar");
		dayscholar.calculateFees();
	}
	

}
