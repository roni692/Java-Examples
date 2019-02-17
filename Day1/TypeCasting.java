package Training;

public class TypeCasting 
{
	public static void main(String[] args)
	{
		double d =20;
		//int intval =10;
		//double doubleVal=20.00;
		//double d =20;
		int intval=10;
		intval = (int) d;//explicit typecasting or down casting
		
		System.out.println(intval);
		byte a =10;
		int b= a;//implicicit type casting automatic
		System.out.println(b);
		
	}
}
