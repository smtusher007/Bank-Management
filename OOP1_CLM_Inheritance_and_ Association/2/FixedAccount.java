import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;

	public FixedAccount()
	{
		System.out.println("Empty - Fixed Account");
	}
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear( )
	{
		return this.tenureYear;
	}
}