package TrainingDaytwo;

public class thisSimple 
{
	public static void main(String[] args)
	{
		//Concept of anonymous inner class
		Square square = new Square();
		square.display(5);
		int area = square.calculateArea();
		System.out.println("The area of square is" +area);
	}

}
