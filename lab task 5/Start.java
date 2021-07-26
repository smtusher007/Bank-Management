import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new FixedAccount("F387138",25000,5);
		Account a2 = new FixedAccount("F912837",30000,6);
		Account a3 = new FixedAccount("Fsd3123",35000,7);
		Account a4 = new SavingsAccount("S120812",40000,12);
		Account a5 = new SavingsAccount("S921972",45000,15);
		Account a6 = new SavingsAccount("S092821",50000,18);
		System.out.println(" \n...................................................\n ");
		Customer c1= new Customer(12312312,"Monjur",10);
		Customer c2= new Customer(12312333,"Morshed",10);
		System.out.println(" \n...................................................\n ");
		System.out.println("Customer NID no: "+c1.getNid());
		System.out.println("Customer Name: "+c1.getName());
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		c1.insertAccount(a5);
		c1.insertAccount(a6);
		System.out.println(" \n...................................................\n ");
		c1.showAllAccount();
		System.out.println(" \n...................................................\n ");
		c1.removeAccount(a1);
		c1.removeAccount(a2);
		c1.removeAccount(a3);
		c1.removeAccount(a4);
		c1.removeAccount(a5);
		c1.removeAccount(a6);
		System.out.println(" \n...................................................\n ");
	    System.out.println("Customer NID no: "+c2.getNid());
		System.out.println("Customer Name: "+c2.getName());
		c2.insertAccount(a1);
		c2.insertAccount(a2);
		c2.insertAccount(a3);
		c2.insertAccount(a4);
		c2.insertAccount(a5);
		c2.insertAccount(a6);
		System.out.println(" \n...................................................\n ");
		c2.showAllAccount();
		System.out.println(" \n...................................................\n ");
		c2.removeAccount(a1);
		c2.removeAccount(a2);
		c2.removeAccount(a3);
		c2.removeAccount(a4);
		c2.removeAccount(a5);
		c2.removeAccount(a6);
	}
}