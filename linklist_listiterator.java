package Collection;
	import java.util.LinkedList;
	import java.util.ListIterator;

	public class linklist_listiterator 
	{
		public static void main(String[] args) 
		{
		 LinkedList l1 =new LinkedList();
		 l1.add(10); l1.add(40); l1.add(20);l1.add(80);l1.add(90); l1.add(80);
		 ListIterator l2=l1.listIterator();
		 System.out.println("forward direction");
		 while(l2.hasNext())
		 {
			 System.out.println(l2.next());
	      }
		 
			 System.out.println("backward direction");
			 while(l2.hasPrevious())
			 {
				 System.out.println(l2.previous());
		     }
		}

	}



