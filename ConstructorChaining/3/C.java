import java.lang.*;

public class C extends B
{
	public C(){
		super();
		System.out.println("E-C");
	}
	public C(int c1){
		super(c1);
		System.out.println("P-C1");
	}
	public C(int c1, int c2){
		super(c1, c2);
		System.out.println("P-C2");
	}
}
