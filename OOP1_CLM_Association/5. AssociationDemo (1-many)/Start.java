import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountHolderName("OOP1 G");
		a1.setAccountNumber(11111111);
		a1.setBalance(2000.0);
		
		Account a2 = new Account();
		a2.setAccountHolderName("OOP1 C");
		a2.setAccountNumber(11111112);
		a2.setBalance(2500.0);
		
		Account a3 = new Account();
		a3.setAccountHolderName("OOP2 G");
		a3.setAccountNumber(11111113);
		a3.setBalance(2000.0);
		
		Account a4 = new Account();
		a4.setAccountHolderName("OOP2 I");
		a4.setAccountNumber(11111114);
		a4.setBalance(2500.0);
		
		Account a5 = new Account();
		a5.setAccountHolderName("OOP1 G");
		a5.setAccountNumber(11111115);
		a5.setBalance(2000.0);
		
		Account a6 = new Account();
		a6.setAccountHolderName("OOP1 C");
		a6.setAccountNumber(11111116);
		a6.setBalance(2500.0);
		
		Customer c1 = new Customer("+880123456678", 5);
		
		if(c1.insertAccount(a1)){
			System.out.println(a1.getAccountNumber() + " Account Inserted");
		}
		else{System.out.println(a1.getAccountNumber() + " Account can not be inserted");}
		
		if(c1.insertAccount(a2)){
			System.out.println("Account Inserted");
		}
		else{System.out.println("Account can not be inserted");}
		
		if(c1.insertAccount(a3)){
			System.out.println("Account Inserted");
		}
		else{System.out.println("Account can not be inserted");}
		
		if(c1.insertAccount(a4)){
			System.out.println("Account Inserted");
		}
		else{System.out.println("Account can not be inserted");}
		
		if(c1.insertAccount(a5)){
			System.out.println("Account Inserted");
		}
		else{System.out.println("Account can not be inserted");}
		
		if(c1.insertAccount(a6)){
			System.out.println(a6.getAccountNumber() + " Account Inserted");
		}
		else{System.out.println(a6.getAccountNumber() + " Account can not be inserted");}
		
		c1.showAllAccounts();
		
		
		if(c1.removeAccount(a6)){
			System.out.println(a6.getAccountNumber() + " Account Removed");
		}
		else{System.out.println(a6.getAccountNumber() + " Account can not be removed");}
		
		if(c1.removeAccount(a3)){
			System.out.println(a3.getAccountNumber() +  " Account Removed");
		}
		else{System.out.println(a3.getAccountNumber() + " Account can not be removed");}
		
		c1.showAllAccounts();
		
		
		
		
	}
}