package courseregistration;

public interface InterOne
{
	int one=10;
	int varTwo=100;
	void methodOne();
	void methodTwo();

}
class Example implements InterOne
{
	public void methodOne()
	{
		//varTwo = varTwo+10;
		System.out.println("Value of varone " +one);
		System.out.println("Value of varTwo " +varTwo);

	}
	public void methodTwo()
	{
		System.out.println("Good afternoon");
		
	}
}

