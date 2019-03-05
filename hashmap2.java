package Collection;

import java.util.HashMap;

public class hashmap2 
{
	public static void main(String[] args) {
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(100,"amit");
		map.put(101,"vijay");
		map.put(103,"rahul");
		map.put(104,"Gaurav");
		System.out.println("initial list of element"+map);
		map.remove(100);
		System.out.println("upadated list of element"+map);
		map.remove(101);
		System.out.println("updated list of element"+map);
		map.remove(102,"Rahul");
		System.out.println("updated list of element"+map);
	}

}
