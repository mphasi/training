interface studentdetails 
{
	void display();
}
interface result
{
	void result();
}
public class Interfaceexample implements studentdetails,result
{

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("first Division");
	}

	@Override
	public void display() 
	{
	System.out.println("This is sanada");
		
	}
	public static void main(String[] args)
	{
		Interfaceexample ob = new Interfaceexample() ;
		ob.display();
		ob.result();
		
		
	}

}
