import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private Account accounts[];
	
	public Customer(int nid, String name,int size)
	{
		System.out.println("Parameterize construstor Customer");
		this.nid = nid;
		this.name = name;
		accounts = new Account[size];
	}
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNid()
	{
		return nid;
	}
	public String getName()
	{
		return name;
	}
	public void insertAccount(Account a)
	{
		boolean flag = false;
		
		for(int i =0;i<accounts.length;i++)
		{
			if(accounts[i] == null)
			{
				accounts[i]=a;
				flag = true;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Inserted");
		}
		else 
		{
			System.out.println("Can Not Insert");
		}
	}
	public void removeAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Removed.....");
		}
		else
		{
			System.out.println("can not possible to Remove");
		}
	}
	public void showAllAccount()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("...........\n");
				System.out.println("accounts["+i+"] Account Number: "+accounts[i].getAccountNo());
				System.out.println("accounts["+i+"] Account Balance: "+accounts[i].getBalance());
			}
		}
	}
}