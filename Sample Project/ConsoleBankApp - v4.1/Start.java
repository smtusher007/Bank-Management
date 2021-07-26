import java.lang.*;
import java.util.Scanner;
import classes.*;


public class Start
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("Welcome to XYZ Bank");
		System.out.println("--------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Customer Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Exit");
			System.out.println("--------------------------\n");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("--------------------------\n");
			
			switch(choice)
			{
				case 1:
					System.out.println("--------------------------");
					System.out.println("You Have Choosen Employee Management");
					System.out.println("--------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					System.out.println("--------------------------");
					System.out.print("Enter your choice: ");
					int option1 = sc.nextInt();
					System.out.println("--------------------------\n");
					
					switch(option1)
					{
						case 1:
							System.out.println("--------------------------");
							System.out.println("You Have Choosen to Insert An Employee");
							System.out.println("--------------------------");
							
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
							
							if(b.insertEmployee(e1))
							{
								System.out.println("Employee Inserted with ID: "+e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Can Not be Inserted");
							}
								
							break;
						case 2:
							System.out.println("--------------------------");
							System.out.println("You Have Choosen Remove An Employee");
							System.out.println("--------------------------");
							
							System.out.print("Enter the Employee ID to Remove: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 !=null)
							{
								if(b.removeEmployee(e2))
								{
									System.out.println("Employee Removed with ID: "+e2.getEmpId());
								}
								else
								{
									System.out.println("Employee Can Not be Removed");
								}
							}
							else
							{
								System.out.println("Employee Does Not Exists.......");
							}
							
							break;
						case 3:
							System.out.println("--------------------------");
							System.out.println("You Have Choosen to Search An Employee");
							System.out.println("--------------------------");
							
							System.out.print("Enter the Employee ID to Search: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found.......");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists.......");
							}
							
							
							break;
						case 4:
							System.out.println("--------------------------");
							System.out.println("You Have Choosen to Show All Employees");
							System.out.println("--------------------------");
							
							b.showAllEmployees();
							
							break;
						case 5:
							System.out.println("--------------------------");
							System.out.println("You Have Choosen to Go Back.......");
							System.out.println("--------------------------");
							
							
							
							break;
						default:
							System.out.println("\nInvalid Choice.....\n");
							break;
					}
					break;
				
				case 2:
					System.out.println("--------------------------");
					System.out.println("You Have Choosen Customer Management");
					System.out.println("--------------------------");
					break;
					
				case 3:
					System.out.println("--------------------------");
					System.out.println("You Have Choosen Customer-Account Management");
					System.out.println("--------------------------");
					break;
					
				case 4:
					System.out.println("--------------------------");
					System.out.println("You Have Choosen Transactions");
					System.out.println("--------------------------");
					break;
					
				case 5:
					System.out.println("--------------------------");
					System.out.println("You Have Choosen to Exit");
					System.out.println("--------------------------");
					
					repeat = false;
					break;
					
				default:
					System.out.println("\nInvalid Choice.....\n");
					break;
			}
			System.out.println("--------------------------");
		}
	}
}