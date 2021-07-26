import java.lang.*;

public class Account
{
	private String accountNumber;
	private double balance;

	public Account( )
	{
		System.out.println("Empty-Account");
	}
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNumber( )
	{
		return this.accountNumber;
	}
	
	public double getBalance( )
	{
		return this.balance;
	}
	public void depositMoney(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println(amount +"$ has been Deposited");
		}
		else
		{
			System.out.println("Can Not Deposit");
		}
	
	}
	public void withdrawMoney(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance = balance - amount;
			System.out.println(amount +"$ has been Withdrawn");
		}
		else
		{
			System.out.println("Can Not Withdraw");
		}
		
	}
}