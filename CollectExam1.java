package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectExam1 
	{
		public static void main(String[] args) {
			LinkedHashSet<String> ts=new LinkedHashSet<String>();
			ts.add("geet"); ts.add("sunil"); ts.add("summet");
			System.out.println(ts);
			Iterator<String> itr=ts.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("****************");
			for(String str:ts)
			{
				System.out.println(str);
			}
		}

		
	}



