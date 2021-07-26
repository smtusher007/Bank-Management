import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount()
	{
		System.out.println("Empty constructor Savings Account");
	}
	public SavingsAccount(String accountNo, double balance, double interestRate)
	{
		super(accountNo,balance);
		this.interestRate=interestRate;
		System.out.println("Parameterize constructor Savings Account");
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
}