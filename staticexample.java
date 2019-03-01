
public class staticexample
{
	static int a=5,b=8;
	static int c;
	static int sum(int a,int b)
	{
		c=a+b; return c;
	}
	static 
	{
		System.out.println("static block");
	}
		static void increment()
		{
			System.out.println(a++);
		}
	
	public static void main(String[] args) {
		System.out.println("The sum is"+ sum(6,7));
		increment();
		increment();
		increment();
		increment();
		
	}
	

}
