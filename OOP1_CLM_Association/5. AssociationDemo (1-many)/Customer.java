import java.lang.*;

public class Customer
{
	private String phnNumber;
	private Account accounts[];
	
	public Customer()
	{
		
	}
	public Customer(String phnNumber, int sizeOfArray)
	{
		this.phnNumber = phnNumber;
		accounts = new Account[sizeOfArray];
	}
	
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber(){return phnNumber;}
	
	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		
		for(int i =0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 0){return false;}
		else{return true;}
	}
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("----------------------\n");
				System.out.println("accounts["+i+"] Account Number: "+accounts[i].getAccountNumber());
				System.out.println("accounts["+i+"] Account Holder Name: "+accounts[i].getAccountHolderName());
				System.out.println("accounts["+i+"] Account Balance: "+accounts[i].getBalance());
			}
		}
	}
	
	
	
	
	
	
	
	
}