package TrainingDaytwo;

public class DemoArray 
{
	public static void main(String[] args)
	{
		int[][] firstArrayMatrix= {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][]= {{2,2,2},{2,2,2}};
		//int Sum[][] = new int[2][3];
		//int Sum[][]=firstArrayMatrix[][]+secondArrayMatrix[][]; 
		System.out.println("Matrix 1");
		//for(int i=0;i<firstArrayMatrix.length;i++)
		//{
			//for(int j=0;j<firstArrayMatrix[i].length;j++)
			//{
				//firstArrayMatrix[i][j] =j;
				//for(int i =0;i<firstArrayMatrix.length;i++)
				//{
				
					//for(int j =0;j<firstArrayMatrix[i].length;j++)
						//{
							//if(i==0)
							//{
								//System.out.print(+firstArrayMatrix[i][j]);
							//System.out.println(" ");
							//}
							
							////System.out.println("");
							//else 
							//{
								//System.out.println(""+firstArrayMatrix[i][j]);
							//}
								//System.out.print(+firstArrayMatrix[i][j]);
								//System.out.println("");
						//	}
						//System.out.println("");
						
					//}
				//}
				System.out.print(" "+firstArrayMatrix[0][0]);
				System.out.print(" "+firstArrayMatrix[0][1]);
				System.out.print(" "+firstArrayMatrix[0][2]);
				System.out.println("");
				System.out.print(" "+firstArrayMatrix[1][0]);
				System.out.print(" "+firstArrayMatrix[1][1]);
				System.out.print(" "+firstArrayMatrix[1][2]);
				
				System.out.println("");
				
				System.out.println("Matrix 2");

				System.out.print(" "+secondArrayMatrix[0][0]);
				System.out.print(" "+secondArrayMatrix[0][1]);
				System.out.print(" "+secondArrayMatrix[0][2]);
				System.out.println("");
				System.out.print(" "+secondArrayMatrix[1][0]);
				System.out.print(" "+secondArrayMatrix[1][1]);
				System.out.print(" "+secondArrayMatrix[1][2]);
				System.out.println("");
				System.out.println("Display Sum of Matrices");
				
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[0][0]);
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[0][1]);
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[0][2]);
				System.out.println("");
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[1][0]);
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[1][1]);
				System.out.print(firstArrayMatrix[0][0]+secondArrayMatrix[1][2]);
			//}
			//System.out.print("\t");
		}
	//}
}
