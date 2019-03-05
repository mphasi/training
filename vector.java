package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector 
{
	public static void main(String[] args)
{
		Vector v =new Vector();
		v.add(10);v.add(40);v.add(20); v.add(80);v.add(90);v.add(50);
		Enumeration en =v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}

}
