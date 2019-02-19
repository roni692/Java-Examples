package courseregistration;

public class Account
{
	int accAmount;
	int accNo;
	String custName;
	
	public void setAccNo(int acno)
	{	
		accNo = acno;
	}
	public void setaccAmount(int amount)
	{
		accAmount =amount;
	}
	public void setcustName(String name)
	{
		custName =name;
	}
	public int getAccNO()
	{
		return accNo;
	}
	public int getaccAmount()
	{
		return accAmount;
	}
	public String getcustName()
	{
		return custName;
	}
}
