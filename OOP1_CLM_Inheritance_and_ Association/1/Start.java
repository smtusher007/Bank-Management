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
		
		SavingsAccount sa2 = new SavingsAccount("S000002", 4000.0, 3.2);
		FixedAccount fa2 = new FixedAccount("F000002", 200000.0, 10);
		
		System.out.println();
		System.out.println("Account Number: "+sa1.getAccountNumber());
		System.out.println("Account Balance: "+sa1.getBalance());
		System.out.println("Interest Rate: "+sa1.getInterestRate());
		System.out.println("-------------------");
		
		sa2.showDetails();
		
		System.out.println("-------------------");
		System.out.println("Account Number: "+fa1.getAccountNumber());
		System.out.println("Account Balance: "+fa1.getBalance());
		System.out.println("Tenure Year: "+fa1.getTenureYear());
		System.out.println("-------------------");
		fa2.showDetails();
		
		System.out.println("/////////////////////////////////////////////");
		
		Customer c1 = new Customer();
		c1.setNid(11223344);
		c1.setName("Nabil");
		c1.setSavingsAccount(sa1);
		c1.setFixedAccount(fa1);
		
		Customer c2 = new Customer(22113344, "Ridan", fa2, sa2);
		System.out.println("###############################");
		System.out.println("Customer NID: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		System.out.println("-------------------");
		System.out.println("Customer Savings Account Number: "+c1.getSavingsAccount().getAccountNumber());
		System.out.println("Customer Savings Account Balance: "+c1.getSavingsAccount().getBalance());
		System.out.println("Customer Savings Account Interest Rate: "+c1.getSavingsAccount().getInterestRate());
		System.out.println("-------------------");
		System.out.println("Customer Fixed Account Number: "+c1.getFixedAccount().getAccountNumber());
		System.out.println("Customer Fixed Account Balance: "+c1.getFixedAccount().getBalance());
		System.out.println("Customer Fixed Account Tenure Year: "+c1.getFixedAccount().getTenureYear());
		
		
		System.out.println("###############################");
		System.out.println("Customer NID: "+c2.getNid());
		System.out.println("Customer Name: "+c2.getName());
		System.out.println("-------------------");
		c2.getSavingsAccount().showDetails();
		System.out.println("-------------------");
		c2.getFixedAccount().showDetails();
		
	}
}