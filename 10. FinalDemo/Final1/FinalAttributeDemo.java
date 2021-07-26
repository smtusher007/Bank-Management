import java.lang.*;

public class FinalAttributeDemo
{
	private final int a ;
	
	public FinalAttributeDemo()
	{
		a = 100;
	}
	public FinalAttributeDemo(int a)
	{
		this.a = a;
	}
	//public void setA(int a){this.a = a;}
	public int getA(){return a;}
}