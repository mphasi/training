
 abstract class Abstclas
 { 
	 int empno;	String name,address;
	 	public Abstclas(int empno, String name, String address) 
	 {
	 	this.empno = empno;		this.name = name;		this.address = address;	
	 }
	 	abstract void details();	
	 }
	 public class Abstract extends Abstclass
	 {
	 int salary;
	 	public Abstract(int empno, String name, String address,int salary)
	 	{
	 	super(empno, name, address);
	 	this.salary=salary;	
	 }
	 	@Override
	 	void details() 
	 	{
	 	System.out.println("empno"+empno+"name is "+name+"address is "+address+"salary is"+salary);
	 		System.out.println("I work for Mphasis");		
	 }
	 	public static void main(String[] args) 
	 {
	 		Abstract ob=new Abstract(101,"sandip","bangalore",45000);
	 			ob.details();	
	 }
	 }


