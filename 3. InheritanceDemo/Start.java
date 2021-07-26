import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		
		r1.setDim1(2.5);
		r1.setDim2(3.5);
		
		System.out.println("R dim1: "+r1.getDim1());
		System.out.println("R dim2: "+r1.getDim2());
		System.out.println("R area: "+r1.calculateArea());
	}
}