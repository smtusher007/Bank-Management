import java.lang.*;

public interface IAccountOperations
{
	void addAccount(Account a);
	void removeAccount(Account a);
	Account searchAccount(int accountNumber);
	void showAllAccounts();
}