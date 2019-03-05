package Collection;

import java.util.ArrayList;

public class CArraylist {
   public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10); a1.add(50); a1.add(60); a1.add(100); a1.add(90); a1.add(80);
	System.out.println(a1);
	a1.add(3,500);       // 100 will move next postion
	System.out.println(a1);
	a1.remove(2);           // remove 2nd position element
	System.out.println(a1);
	a1.set(4,1000);            //replace 4th position element and put 1000;
	System.out.println(a1);
}
}
