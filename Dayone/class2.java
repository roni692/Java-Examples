package Training;
//lesson learnt if you want to use instance variable throughout the class 
//use static modifier for the variable
//therefore you would be able to use the variable even in methods
public class class2 
{
	static int i =22;
	static int j =14000;
	static boolean k;
	static boolean l;
	class2(int x,int y)
	{
		x=i;
		y=j;
		
	}

	public static void main(String[] args)
	{
		class2 class2 = new class2(i,j);
		k=class2.Method1(i);
		l = class2.Method2(j);
		if(k==true && l == true)
		{
			System.out.print("Is a new employee");
			
		}
		else 
		{
			System.out.print("Is not a new employee");
		}
		
	}
	public boolean Method1(int i)
	{
		if(i>20 && i<30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean Method2(int j)
	{
		if(j>=14000 && j<20000)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}
