import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber("S000001");
		sa1.setBalance(5000.0);
		sa1.setInterestRate(2.3);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber("F000001");
		fa1.setBalance(1000000.0);
		fa1.setTenureYear(5);
		
		SavingsAccount sa2 = new SavingsAccount();
		sa2.setAccountNumber("S000002");
		sa2.setBalance(5000.0);
		sa2.setInterestRate(2.3);
		
		FixedAccount fa2 = new FixedAccount();
		fa2.setAccountNumber("F000002");
		fa2.setBalance(1000000.0);
		fa2.setTenureYear(5);
		
		SavingsAccount sa3 = new SavingsAccount();
		sa3.setAccountNumber("S000003");
		sa3.setBalance(5000.0);
		sa3.setInterestRate(2.3);
		
		FixedAccount fa3 = new FixedAccount();
		fa3.setAccountNumber("F000003");
		fa3.setBalance(1000000.0);
		fa3.setTenureYear(5);
		
		SavingsAccount sa4 = new SavingsAccount();
		sa4.setAccountNumber("S000004");
		sa4.setBalance(5000.0);
		sa4.setInterestRate(2.3);
		
		FixedAccount fa4 = new FixedAccount();
		fa4.setAccountNumber("F000004");
		fa4.setBalance(1000000.0);
		fa4.setTenureYear(5);
		
		
		System.out.println("--------------------------\n");
		System.out.println("##########################");
		System.out.println("\n------------------------\n");
		
		Customer c1 = new Customer(11111111, "Nabil", 5, 10);
		Customer c2 = new Customer(22222222, "Ridan", 3, 12);
		
		System.out.println("//////////////////////////////////////");
		System.out.println("Customer NID: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("--------------------------");
		c1.showAllSavingsAccounts();
		System.out.println("--------------------------");
		c1.showAllFixedAccounts();
		
		if(c1.insertSavingsAccount(sa1))
		{
			System.out.println(sa1.getAccountNumber()+" Has Been Inserted for NID: "+ c1.getNid());
		}
		else
		{
			System.out.println(sa1.getAccountNumber() + " Can Not be Inserted for NID: "+ c1.getNid());
		}
		
		if(c1.insertSavingsAccount(sa3))
		{
			System.out.println(sa3.getAccountNumber()+" Has Been Inserted for NID: "+ c1.getNid());
		}
		else
		{
			System.out.println(sa3.getAccountNumber() + " Can Not be Inserted for NID: "+ c1.getNid());
		}
		
		if(c2.insertSavingsAccount(sa2))
		{
			System.out.println(sa2.getAccountNumber()+" Has Been Inserted for NID: "+ c2.getNid());
		}
		else
		{
			System.out.println(sa2.getAccountNumber() + " Can Not be Inserted for NID: "+ c2.getNid());
		}
		
		if(c2.insertSavingsAccount(sa4))
		{
			System.out.println(sa4.getAccountNumber()+" Has Been Inserted for NID: "+ c2.getNid());
		}
		else
		{
			System.out.println(sa4.getAccountNumber() + " Can Not be Inserted for NID: "+ c2.getNid());
		}
		
		if(c1.insertFixedAccount(fa1))
		{
			System.out.println(fa1.getAccountNumber()+" Has Been Inserted for NID: "+ c1.getNid());
		}
		else
		{
			System.out.println(fa1.getAccountNumber() + " Can Not be Inserted for NID: "+ c1.getNid());
		}
		
		if(c1.insertFixedAccount(fa3))
		{
			System.out.println(fa3.getAccountNumber()+" Has Been Inserted for NID: "+ c1.getNid());
		}
		else
		{
			System.out.println(fa3.getAccountNumber() + " Can Not be Inserted for NID: "+ c1.getNid());
		}
		
		if(c2.insertFixedAccount(fa2))
	    {
			System.out.println(fa2.getAccountNumber()+" Has Been Inserted for NID: "+ c2.getNid());
		}
		else
		{
			System.out.println(fa2.getAccountNumber() + " Can Not be Inserted for NID: "+ c2.getNid());
		}
		
		if(c2.insertFixedAccount(fa4))
		{
			System.out.println(sa4.getAccountNumber()+" Has Been Inserted for NID: "+ c2.getNid());
		}
		else
		{
			System.out.println(fa4.getAccountNumber() + " Can Not be Inserted for NID: "+ c2.getNid());
		}
		
		System.out.println("//////////////////////////////////////");
		System.out.println("Customer NID: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("--------------------------");
		c1.showAllSavingsAccounts();
		System.out.println("--------------------------");
		c1.showAllFixedAccounts();
		
		System.out.println("//////////////////////////////////////");
		System.out.println("Customer NID: "+c2.getNid());
		System.out.println("Customer Name: "+c2.getName());
		System.out.println("--------------------------");
		c2.showAllSavingsAccounts();
		System.out.println("--------------------------");
		c2.showAllFixedAccounts();


		
	}
}