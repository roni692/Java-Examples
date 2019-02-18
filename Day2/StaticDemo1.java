package TrainingDaytwo;

public class StaticDemo1 
{
	private int num;
	//declare variable static
	//private static  int num;
	static void display()
	{//either create the object and then call
		//StaticDemo1 st = new StaticDemo1();
		//System.out.println(st.num);
		System.out.println(num);
		
	}
	
	public static void main(String[] args)
	{
		
		//StaticDemo.display();
		StaticDemo1.display();
	}

}
