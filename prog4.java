
public class prog4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++)
		{
	        	int	Count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					Count++;
				}
			}
	     if(Count==0)
	     {
	    	 System.out.println(i);
	     }
		}
		
		
		   
		
	}

}
