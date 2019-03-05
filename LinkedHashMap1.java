package Collection;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap1
{
		public static void main(String[] args) {
			HashMap<Integer,String>map = new HashMap<Integer,String>();
			map.put(100,"amit");
			map.put(101,"vijay");
			map.put(102,"rahul");
			for(Map.Entry m:map.entrySet())
			{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		}
	}
