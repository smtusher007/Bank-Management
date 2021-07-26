import java.lang.*;

public class A
{
	public A(){
		
		System.out.println("E-A");
	}
	public A(int a1){
		
		System.out.println("P-A1");
	}
	public A(int a1, int a2){
		this();
		System.out.println("P-A2");
	}
}