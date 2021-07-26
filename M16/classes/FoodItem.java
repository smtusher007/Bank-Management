package classes;
import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setFid(String fid)
	{
		this.fid = fid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getFid()
	{
		return fid;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	public abstract void showInfo();
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous price: "+ price);
			System.out.println("Inputed amount "+ amount);
			price += amount;
			//balance = balance + amount;
			System.out.println("Current price: "+ price);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=price)
		{
			System.out.println("Previous price:	"+ price);
			System.out.println("Substracted amount "+ amount);
			price -= amount;
			//balance = balance - amount;
			System.out.println("Current price:	"+ price);
			return true;
		}
		else
		{
			return false;
		}
	}	
}