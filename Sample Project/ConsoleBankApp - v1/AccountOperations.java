
import java.lang.*;


public interface AccountOperations
{
	boolean insertAccount(Account a);
	boolean removeAccount(Account a);
	Account searchAccount(int accountNumber);
	void showAllAccounts();
}