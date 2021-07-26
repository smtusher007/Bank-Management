import java.lang.*;
public class SavingsAccount extends Account
{
	private double interestRate;
	SavingsAccount()
	{
		System.out.println("Empty Constructor Saving Account.....");
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