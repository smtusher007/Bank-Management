import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;

	public FixedAccount()
	{
		System.out.println("Empty construstor Fixed Account");
	}
	public FixedAccount(String accountNo,double balance,int tenureYear)
	{
		super(accountNo, balance);
		this.tenureYear=tenureYear;
		System.out.println("Parameterize construstor Fixed Account");
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}	
}