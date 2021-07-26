import java.lang.*;

public class Rectangle extends Shape
{
	private double dim2;
	
	public Rectangle(){System.out.println("Empty-Rectangle");}
	
	public void setDim2(double dim2){this.dim2 = dim2;}
	public double getDim2(){return dim2;}
	
	public double calculateArea(){return dim1 * dim2;}
}