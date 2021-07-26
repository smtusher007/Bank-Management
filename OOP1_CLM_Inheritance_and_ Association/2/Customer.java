import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private FixedAccount fixedAccounts[];
	private SavingsAccount savingsAccounts[];
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(int nid, String name, int size1, int size2)
	{
		System.out.println("Para Customer");
		this.nid = nid;
		this.name = name;
		fixedAccounts = new FixedAccount[size1];
		savingsAccounts = new SavingsAccount[size2];
	}
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	
	public boolean insertSavingsAccount(SavingsAccount a)
	{
		boolean flag = false;
		
		for(int i =0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == null)
			{
				savingsAccounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeSavingsAccount(SavingsAccount a)
	{
		int flag = 0;
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == a)
			{
				savingsAccounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void showAllSavingsAccounts()
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				System.out.println("-----------------------\n");
				System.out.println("savingsAccounts["+i+"] Savings Account Number: "+savingsAccounts[i].getAccountNumber());
				System.out.println("savingsAccounts["+i+"] Savings Account Balance: "+savingsAccounts[i].getBalance());
				System.out.println("savingsAccounts["+i+"] Savings Account Interest Rate: "+savingsAccounts[i].getInterestRate());
			}
		}
	}
	
	public boolean insertFixedAccount(FixedAccount a)
	{
		boolean flag = false;
		
		for(int i =0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == null)
			{
				fixedAccounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFixedAccount(FixedAccount a)
	{
		int flag = 0;
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == a)
			{
				fixedAccounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 0){return false;}
		else{return true;}
	}
	public void showAllFixedAccounts()
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				System.out.println("-----------------------\n");
				System.out.println("fixedAccounts["+i+"] Fixed Account Number: "+fixedAccounts[i].getAccountNumber());
				System.out.println("fixedAccounts["+i+"] Fixed Account Balance: "+fixedAccounts[i].getBalance());
				System.out.println("fixedAccounts["+i+"] Fixed Account Tenure Year: "+fixedAccounts[i].getTenureYear());
			}
		}
	}
}