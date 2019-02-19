package courseregistration;

public class Travel 
{
	char modeOfTravel;
	int noOfTickets;
	double amount;
	
	public void setmodeoftravel(char mode)
	{	
		modeOfTravel=mode;
	}
	public void setnoofTicket(int ntickets)
	{
		noOfTickets = ntickets;
	}
	public void setamount(double amt)
	{
		amount =amt;
	}
	public int getmodeoftravel()
	{
		return modeOfTravel;
	}
	public int getanoofTicket()
	{
		return noOfTickets;
	}
	public double getamount()
	{
		return amount;
	}

}
