import java.lang.*;

public class B extends A
{
	public B(){
		super();
		System.out.println("E-B");
	}
	public B(int b1){
		super();
		System.out.println("P-B1");
	}
	public B(int b1, int b2){
		super();
		System.out.println("P-B2");
	}
}