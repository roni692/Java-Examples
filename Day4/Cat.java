package courseregistration;

public class Cat extends Animal 
{
	public static void testClassMethod()
	{
		
	}
	public void testInstanceMethod()
	{
		System.out.println("the instance method in animal");
	}
	
	public static void main(String[] args)
	{
		Cat myCat =new Cat();
		Animal myAnimal = new Cat();
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();
		//Animal myAnimal = myCat();
		
	}

}
