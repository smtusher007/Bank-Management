import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount()
	{
		System.out.println("Empty - Savings Account");
	}

	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate( )
	{
		return this.interestRate;
	}
}