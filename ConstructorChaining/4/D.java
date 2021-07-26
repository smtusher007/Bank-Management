import java.lang.*;

public class D extends B
{
	public D(){
		this(10);
		System.out.println("E-D");
	}
	public D(int d1){
		super();
		System.out.println("P-D1");
	}
	public D(int d1, int d2){
		super(d1);
		System.out.println("P-D2");
	}
}