package TrainingDaytwo;

public class StaticDemo 
{
	static int count=10;
	StaticDemo()
	{
		count++;
	}
	static void display()
	{
		System.out.println(count);
	}
	static
	{
		System.out.println("Sttaic block written before main method");
	}
	public static void main(String[] args)
	{
		StaticDemo t1 = new StaticDemo();
		//StaticDemo t2 = new StaticDemo();
		StaticDemo.display();
		//t2.display();
	}

	static
	{
		System.out.println("Static block written after the main method");
	}
}
