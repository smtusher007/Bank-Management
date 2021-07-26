import java.lang.*;

public class C extends B
{
	public C(){
		super(10);
		System.out.println("E-C");
	}
	public C(int c1){
		System.out.println("P-C1");
	}
	public C(int c1, int c2){
		this(c2);
		System.out.println("P-C2");
	}
}