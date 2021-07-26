import java.lang.*;

public class Account
{
	private String accountNumber;
	private double balance;

	public Account()
	{
		System.out.println("Empty-Account");
	}
	public Account(String accountNumber, double balance)
	{
		System.out.println("Para-Account");
		this.accountNumber = accountNumber;
		this.balance = balance;
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
			System.out.println("Amount Deposited");
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
			System.out.println("Amount Withdraw");
		}
		else
		{
			System.out.println("Can Not Withdraw");
		}
	}
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
	}
}