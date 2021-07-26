import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;

	public FixedAccount ()
	{
		System.out.println("Empty - Fixed Account");
	}
	public FixedAccount(String accountNumber, double balance, int tenureYear)
	{
		super(accountNumber, balance);
		System.out.println("Para - Fixed Account");
		this.tenureYear = tenureYear;
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear( )
	{
		return this.tenureYear;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Tenure Year: "+tenureYear);
	}	
}