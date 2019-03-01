import java.util.Scanner;

public class prog3 
{
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the 3 no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>b && a>c)
	{
		System.out.println("Gretest no is="+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("Gretest no is=" +b);
	}
	else if (c>a && c>b)
	{
		System.out.println("Gretest no is="+c);
	}
}
}
