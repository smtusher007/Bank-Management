import java.lang.*;

public class Account
{
	private String accountNo;
	private double balance;
    public Account()
	{
		System.out.println("Empty constructor Account");
	}
	public Account(String accountNo, double balance)
	{
		System.out.println("Parameterize constructor Account");
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public void setAccountNo(String accountNo)
	{
		this.accountNo=accountNo;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNo()
	{
		return accountNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public boolean depositAmount(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Amount Deposited :"+amount);
			System.out.println("Your new Balance is :"+balance);
			return true;
		}
		else
		{
			System.out.println("Deposite not possible..");
			return false;
		}
	}
	public boolean withdrawAmount(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Amount Withdraw :"+amount);
			System.out.println("Your current balance is :"+balance);
			return true;
		}
		else
		{
			System.out.println("Withdraw not possible..");
			return false;
		}
	}
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNo);
		System.out.println("Account Balance: "+balance);
	}
}