package courseregistration;

public class MinAccountBalance
{
	public static void main(String[] args)
	{
		Account ac = new Account();
		ac.setAccNo(10);
		ac.setcustName("ronish");
		ac.setaccAmount(5000);
		if(ac.accAmount<500)
		{
			System.out.println("The balance below minimum value");
		}
		else
		{
			System.out.println("Account no. is " +ac.getAccNO());
			System.out.println("Account name. is " +ac.getcustName());
			System.out.println("Account Amount is " +ac.getaccAmount());
		}
	}

}
