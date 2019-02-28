package courseregistration;

import java.util.Scanner;

public class Autogenerate 
{
	int travelcmpnycode;
	char modeoftravel;
	int mcode;
	int bookingreqcode =0001;
	public static void main(String[] args)
	{
		Autogenerate ag = new Autogenerate();
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("Enter the mode of travel");
		
		if(ch == 'F')
		{
			//ag.setbookingreqcode();
			ag.setmcode(102);
			ag.setmodeoftravel('F');
			ag.settravelcmpnycode(115);
			System.out.print(ag.gettravelcmpnycode());
			System.out.print(ag.getmodeoftravel());
			System.out.print(ag.getmcode());
			
			System.out.print(ag.getbookingreqcode());
		}
		else if(ch == 'T')
		{
			//ag.setbookingreqcode();
			ag.setmcode(202);
			ag.setmodeoftravel('T');
			ag.settravelcmpnycode(115);
			System.out.print(ag.gettravelcmpnycode());
			System.out.print(ag.getmodeoftravel());
			System.out.print(ag.getmcode());
			
			System.out.print(ag.getbookingreqcode());
		}
		else 
		{
			//ag.setbookingreqcode();
			ag.setmcode(304);
			ag.setmodeoftravel('B');
			ag.settravelcmpnycode(115);
			System.out.print(ag.gettravelcmpnycode());
			System.out.print(ag.getmodeoftravel());
			System.out.print(ag.getmcode());
			
			System.out.print(ag.getbookingreqcode());
		}
		
	}
	public void settravelcmpnycode(int tcode)
	{
		travelcmpnycode = tcode;
	}
	public void setmodeoftravel(char mtravel)
	{
		modeoftravel = mtravel;
	}
	public void setmcode(int mc)
	{
		mcode = mc;
	}
	//public void setbookingreqcode(String bcode)
	//{//
		//bookingreqcode = bcode;
	//}
	public int gettravelcmpnycode()
	{
		return travelcmpnycode;
	}
	public char getmodeoftravel()
	{
		return modeoftravel;
	}
	public int getmcode()
	{
		return mcode;
	}
	public String getbookingreqcode()
	
	{		
		//String bookingreqcode= (String)"0001";
	    String padded = String.format("%04d" , bookingreqcode++);
	   // System.out.print(padded);
	    //bookingreqcode++;
		
	    //bookingreqcode++;
		return padded;
	}
	

}
