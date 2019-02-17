package Training;

public class passByVal 
{
	public static void main(String[] args)
	{
		int sId=25;
		passByVal val = new passByVal();
		System.out.println(sId);
		new passByVal().passThevalueMethod1(new Student());
			//val.passThevalueMethod1((obj);
		//val.passThevalueMethod1(obj));
			System.out.println("the sId are" + sId);
		
	}
	//public void passThevalueMethod(int sid)
	//{
		//int sId=10;
		//System.out.println("the sId ate"+ sId);
	//}

	public void passThevalueMethod1(Student obj)
	{
		 //obj.studentid=17;
		//char studenttype='c';
		
		System.out.println("the sId are"+ obj.studentid);
	
	}
}
