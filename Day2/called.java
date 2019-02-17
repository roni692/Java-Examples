package TrainingDaytwo;

import java.util.Scanner;

public class called
{
	public static void main(String[] args)
	{
		//String username;
		System.out.println("Enter the user name");
		Scanner sc= new Scanner(System.in);
		String username = sc.nextLine();

		System.out.println("Username is"+username);
		System.out.println(username.length());
		System.out.println(username.toLowerCase());
		System.out.println(username.toUpperCase());
		System.out.println(username.startsWith("a"));
		System.out.println(username.replaceAll(username, "Krishna"));
		
	}

}
