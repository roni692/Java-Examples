package TrainingDaytwo;

public class JaggedArray 
{
	private static String[] strings;

	public static void main(String[] args)
	{
		String[][] student = new String[4][];
		
		//first row 
		student[0]=new String[] {"Tony","JAVA","C","C++"};
		//strings[4] = {"ajja","jaj","jsjs","dgj"};
		//second row
		student[1]=new String[]{"Thomas","JAVA","UNIX"};
		//third row
		student[2]= new String[]{"Dinil","Linux","oracle"};
		//fourth row
		//student[3]= new String[]
		student[3]= new String[] {"Delvin","RDBMS","C#","ORACLE"};
		
		int count;
		for(int row=0;row<student.length;row++)
		{
			System.out.println();
			for(int col=0;col<student[row].length;col++)
			{
				System.out.print(student[row][col]+" ");
			}
		}
	}

}
