import java.util.Scanner;

public class Student
{
	int rollno;
	String name,address;
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno,name,address");
		rollno=ob.nextInt();name=ob.next();address=ob.next();
		}
	void display()
	{
		System.out.println("rollno "+rollno+"name is "+name+" address "+address);
	}
	}
	


