import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-------------------------------------------");
		System.out.println("WelCome to XYZ Bank");
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Customer-Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Eneter you choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1)){ System.out.println("Employee Created With ID: " + e1.getEmpId());}
							else{ System.out.println("Employee can not be created"); }
							
							break;
							
						case 2:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove An Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter the Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(b.removeEmployee(e2))
								{
									System.out.println("Employee with "+ e2.getEmpId() + " has been removed");
								}
								else
								{
									System.out.println("Employee Can Not be Removed");
								}
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search An Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter the Employee ID to search: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Employees");
							System.out.println("-------------------------------------------");
							
							b.showAllEmployees();
							
							
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------------");
							System.out.println("Going Back...............");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 2:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							
							
							Customer c1 = new Customer();
							c1.setNid(nid1);
							c1.setName(name1);
							
							
							if(b.insertCustomer(c1)){ System.out.println("Customer Created With NID: " + c1.getNid());}
							else{ System.out.println("Customer can not be created"); }
							
							break;
							
						case 2:
						
							break;
							
						case 3:
						
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Customers");
							System.out.println("-------------------------------------------");
							
							b.showAllCustomers();
							
							break;
							
						case 5:
							
							System.out.println("-------------------------------------------");
							System.out.println("Going Back...............");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;
					}
					
					break;
					
				case 3:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-Account Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Create an Account for a Customer");
					System.out.println("\t2. Remove an Account of a Customer");
					System.out.println("\t3. Search an Account of a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
					
					System.out.print("Enter your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Create an Account for a Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							if(b.searchCustomer(nid1) != null)
							{
								System.out.println("Which type Of Account do you want?");
								System.out.println("\t1. Savings Account");
								System.out.println("\t2. Fixed Account");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Account Type: ");
								int accountType = sc.nextInt();
								
								if(accountType == 1)
								{
									
									System.out.print("Enter Account Number: ");
									int an1 = sc.nextInt();
									System.out.print("Enter Acount Balance: ");
									double b1 = sc.nextDouble();
									System.out.print("Enter Interest Rate: ");
									double ir = sc.nextDouble();
									
									SavingsAccount sa = new SavingsAccount();
									sa.setAccountNumber(an1);
									sa.setBalance(b1);
									sa.setInterestRate(ir);
									
									if(b.searchCustomer(nid1).insertAccount(sa))
									{
										System.out.println("Account Number "+ an1 +" inserted for "+ nid1);
									}
									else
									{
										System.out.println("Account Can NOt be inserted");
									}
								}
								else if(accountType == 2)
								{
									System.out.print("Enter Account Number: ");
									int an1 = sc.nextInt();
									System.out.print("Enter Acount Balance: ");
									double b1 = sc.nextDouble();
									System.out.print("Enter Tenure Year: ");
									int ty = sc.nextInt();
									
									FixedAccount fa = new FixedAccount();
									fa.setAccountNumber(an1);
									fa.setBalance(b1);
									fa.setTenureYear(ty);
									
									if(b.searchCustomer(nid1).insertAccount(fa))
									{
										System.out.println("Account Number "+ an1 +" inserted for "+ nid1);
									}
									else
									{
										System.out.println("Account Can NOt be inserted");
									}
								}
								else if(accountType == 3)
								{
									System.out.println("-------------------------------------------");
									System.out.println("Going Back...............");
									System.out.println("-------------------------------------------");
								}
								else
								{
									System.out.println("-------------------------------------------");
									System.out.println("Invalid Type...............");
									System.out.println("-------------------------------------------");
								}
									
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							
							break;
							
						case 2:
						
							break;
							
						case 3:
						
							break;
							
						case 4:
						
							break;
							
						case 5:
							
							System.out.println("-------------------------------------------");
							System.out.println("Going Back...............");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;
					}
					
					
					break;
					
				case 4:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Account Transactions");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Deposit Money");
					System.out.println("\t2. Withdraw Money");
					System.out.println("\t3. Show Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Deposit Money");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							if(b.searchCustomer(nid1) != null)
							{
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								
								if(b.searchCustomer(nid1).searchAccount(an1) != null)
								{
									System.out.print("Enter Deposit Amount: ");
									double am = sc.nextDouble();
									
									if(b.searchCustomer(nid1).searchAccount(an1).deposit(am))
									{
										System.out.println("Deposited....");
										frwd.writeInFile("Deposit: $" +am + " in "+ an1+ " by "+ nid1);
										
									}
									else
									{
										System.out.println("Can Not Deposit");
									}
								}
								else
								{
									System.out.println("Invalid Account Number");
								}
									
							}
							else
							{
								System.out.println("NID MISMATCH");
							}
							
							
							break;
							
						case 2:
						
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See Transaction History");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("Going Back...............");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
			
		}
	}
}