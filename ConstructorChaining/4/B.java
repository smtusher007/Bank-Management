import java.lang.*;

public class B extends A
{
	public B(){
		super(10,20);
		System.out.println("E-B");
	}
	public B(int b1){
		this(b1, 20);
		System.out.println("P-B1");
	}
	public B(int b1, int b2){
		super(b2);
		System.out.println("P-B2");
	}
}