package Exception;

import java.util.Scanner;

public class Exceptionexample 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("enter 2 nos");
			int a=ob.nextInt();
			int b=ob.nextInt();
			int c=a/b;
			System.out.println("the result is"+c);
		}
			catch(ArithmeticException ac)
		{
				System.out.println("the error is"+ac);
			
		}
		catch(Exception ab)
		{
			System.out.println("the other error is"+ ab);
		}
		
	}

}
