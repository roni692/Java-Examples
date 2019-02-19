package courseregistration;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Travel t = new Travel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mode of trasnport");
		char ch1 = sc.next().charAt(0);
		System.out.println(ch1);
		
		if(ch1 == 'F')
		{
			t.setamount(500);
			t.setnoofTicket(3);
			//t.setamount(500);
			double TotalServicecharge = (t.amount * t.noOfTickets); 
			System.out.println("Flight travle cost  :" +TotalServicecharge);
		}
		
		else if(ch1 == 'T')
		{
			t.setamount(100);
			t.setnoofTicket(2);
			
			int TotalServicecharge = (int) (t.amount * t.noOfTickets); 
			System.out.println("Train travle cost  :" +TotalServicecharge);
		}
		
		else if(ch1 == 'B')
		{
			t.setamount(50);
			t.setnoofTicket(2);
			int TotalServicecharge = (int) (t.amount*t.noOfTickets); 
			System.out.println("Bus travle cost  :" +TotalServicecharge);
		}
	}

}
