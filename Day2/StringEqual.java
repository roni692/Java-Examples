package TrainingDaytwo;

public class StringEqual
{
	public static void main(String[] args)
	{
		String name1,name2;
		//name1 = "God";
		//name2= name1;
		name1 = new String("God");
		name2= new String("God");
		//if(name1==name2)
		//{
			//System.out.println("Equal");
		//}
		//else 
		//{
			//System.out.println("Not equal");
		//}
		if(name1.equals(name2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
