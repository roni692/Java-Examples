package Training;

public class Operator 
{
	public static void main(String[] args)
	{
		int intVal =10;
		float floatVal =3.0f;
		boolean bool1 = true;
		boolean bool2= false;
		boolean bool3 = true;

	//Arithmetic: Modulud Operator
		System.out.println("Arithmetic");
		System.out.println(intVal +"%" + floatVal +"=" +(intVal % floatVal));
		System.out.println();
		
	//String Concantenation
		System.out.println("String concantenation");
		System.out.println("day" + 2 +"Session");
		System.out.println("\n"+ 2 + 3 +"\n" +(2+3));
		System.out.println();
		
	//Relational: Equality operator
		System.out.println("relational");
		System.out.println(intVal +"==" +floatVal+"="+(intVal==floatVal));
		floatVal = 10.0f;
		System.out.println(intVal +"==" +floatVal+"="+(intVal==floatVal));
		System.out.println();
		
		bool2 =false;
		if(bool1 || (bool1 && (bool2=false)))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		System.out.println("bool 2  value"+bool2);
		
	}
	
}
