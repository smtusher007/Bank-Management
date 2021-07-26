import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount()
	{
		System.out.println("Empty - Savings Account");
	}
	public SavingsAccount(String accountNumber, double balance, double interestRate)
	{
		super(accountNumber, balance);
		System.out.println("Para - Savings Account");
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate( )
	{
		return this.interestRate;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Interest Rate: "+interestRate);
	}

}