import java.lang.*;
public class Start
{
	public static void main(String []args)
	{
		FixedAccount f = new FixedAccount();
	    f.setAccountNumber("A1938I0HT09");
	    f.setAccountHolderName("Mir Monjur Morshed");
	    f.setBalance(50000);
	    f.setTenureYear(2030);
	    System.out.println("Account Number: "+f.getAccountNumber());
	    System.out.println("Account Holder Name: "+f.getAccountHolderName());
	    System.out.println("Account Balance:  "+f.getBalance());
	    f.depositeMoney(100000.00);
	    f.withdrawMoney(2225.00);
	    System.out.println("Tenure Year: "+f.getTenureYear());
	    System.out.println(" ");
		
		SavingsAccount s = new SavingsAccount();
		s.setAccountNumber("A1938I0HT09");
	    s.setAccountHolderName("Mir Monjur Morshed");
	    s.setBalance(50000);
	    s.setInterestRate(15);
	    System.out.println("Account Number: "+s.getAccountNumber());
	    System.out.println("Account Holder Name: "+s.getAccountHolderName());
	    System.out.println("Account Balance:  "+s.getBalance());
		s.depositeMoney(100.00);
	    s.withdrawMoney(200.00);
		System.out.println("Ineterest Rate: "+s.getInterestRate());
	}
}