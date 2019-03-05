package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class First
{
int empno;
String name,address;
public First(int empno,String name,String address)
{
	this.empno=empno;
	this.name=name;
	this.address=address;
	
}
@Override
public String toString() {
	return "First [empno=" + empno + ", name=" + name + ", address=" + address + "]";
}
		
	}


