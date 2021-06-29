package com.bridgelab;

/*********************************************
 * @author mihir
 * 
 * With respect to employees attendance,
 * Calculating employee daily and monthly wage.
 *********************************************/

public class EmployeeWageBuilder
{	
	final static int EMP_FULLTIME_PRESENT = 2;
	final static int EMP_PARTTIME_PRESENT = 1;
	
	private final String company;
	private final int employeeWagePerHr;
	private final int daysInMonth;
	private final int maxHrsInMonth;
	private int employeeMonthlyWage;
	
	/**
	 * Name : EmployeeWageBuilder ( Constructor )
	 * 
	 * @param company
	 * @param employeeWagePerHr
	 * @param daysInMonth
	 * @param maxHrsInMonth
	 */
	public EmployeeWageBuilder(String company, int employeeWagePerHr, int daysInMonth, int maxHrsInMonth)
	{
		this.company = company;
		this.employeeWagePerHr = employeeWagePerHr;
		this.daysInMonth = daysInMonth;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	/**
	 * Name : computeEmployeeWage
	 * 
	 * Description : Method calculate employee monthly wage.
	 * 
	 * Algorithm : First check if employee is full timer, part timer or absent,
	 * every category has different working hr's and wage per hr,
	 * monthly wage is calculated only if employee is completing 100 hrs or 20 working days in a month.
	 * 
	 * Modification : Last commit 28-June-2021
	 */
	public void computeEmployeeWage()
	{
		int employeeDailyWage = 0, workingHrs = 0, totalWorkingHrs = 0, totalWorkingDays = 0;
		
		while(totalWorkingHrs < maxHrsInMonth && totalWorkingDays < daysInMonth)
		{	
			totalWorkingDays++;
			/*
			 *Generating random number using math.random(),
			 *Converting it to nearest possible integer number using Math.floor(),
			 *By doing % 3 we will only get either number 0 , 1 or 2.  
			*/
			int employeeChceck =(int) Math.floor(Math.random() * 10) % 3;
			
			switch (employeeChceck)
			{
			case EMP_FULLTIME_PRESENT:
			{
				workingHrs = 8;
				System.out.println("Employee is full time present.");
				employeeDailyWage = employeeWagePerHr * workingHrs;
				System.out.println("Daily wage of an full timer employee is : " + employeeDailyWage + " Rs.");
				employeeMonthlyWage += employeeDailyWage;
				break;
			}
			case EMP_PARTTIME_PRESENT:
			{
				workingHrs = 4;
				System.out.println("Employee is part time present.");
				employeeDailyWage = employeeWagePerHr * workingHrs;
				System.out.println("Daily wage of an part timer employee is : " + employeeDailyWage + " Rs.");
				employeeMonthlyWage += employeeDailyWage;
				break;
			}
			default:
				System.out.println("Employee is absent.");
			}
			totalWorkingHrs += workingHrs;
		}
	}
	
	@Override
	public String toString()
	{
		return "\nTotal employee wage for Company : " + company + " is : " + employeeMonthlyWage + "\n";
	}

	public static void main(String[] args)
	{
		EmployeeWageBuilder companyReliance = new EmployeeWageBuilder("Reliance", 20, 20, 100);
		EmployeeWageBuilder companyDmart = new EmployeeWageBuilder("D-mart", 10, 15, 98);
		companyReliance.computeEmployeeWage();
		System.out.println(companyReliance);
		companyDmart.computeEmployeeWage();
		System.out.println(companyDmart);
	}
}
