package Training;

import java.util.Scanner;

public class SwitchCase
{

	public static void main(String[] args)
	{
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the value form (A,B,C,D,E or F)");
		//String s=sc.next();
		//char grade = s.charAt(0); 
		char grade ='B';
		
		switch(grade)
		{
		case 'A':
			//if(marks)
			System.out.println("Marks between 80 to 100");
			break;
		case 'B':
			System.out.println("marks between 73 to 79");
			break;
		case 'C':
			System.out.println("Marks between 65 to 72");
			break;
		case 'D':
			System.out.println("marks between 55 to 64");
			break;
		case 'E':
			System.out.println("Marks less than 55");
			break;
		default: 
			System.out.println("Grade does not exist");
			break;
		}
		System.out.print(grade);
		}
		
	}

