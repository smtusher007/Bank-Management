import java.lang.*;
public class Account
{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	Account()
	{
		System.out.println("Empty Constructor Account........");
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void depositeMoney(double amount)
	{
		System.out.println("Deposite money: "+amount);
	}
	public void withdrawMoney(double amount)
	{
		System.out.println("Withdraw money: "+amount);
	}
}