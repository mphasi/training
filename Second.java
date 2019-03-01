import java.util.Scanner;

public class Second
{
	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the 5 no");
		for(int i = 0;i<5;i++)
			a[i]=ob.nextInt();
		System.out.println("the 5 no is");
		for (int i=0;i<5;i++)
			System.out.println(a[i]);
		
	}

}
