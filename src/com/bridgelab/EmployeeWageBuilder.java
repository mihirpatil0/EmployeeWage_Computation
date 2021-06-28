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
	public void computeEmployeeWage(String company, int employeeWagePerHr, int daysInMonth, int maxHrsInMonth)
	{
		int employeeDailyWage = 0, workingHrs = 0, employeeMonthlyWage = 0, totalWorkingHrs = 0, totalWorkingDays = 0;
		
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
		System.out.println("\nEmployee monthly wage for company " + company  + " is " + employeeMonthlyWage + " Rs for " + totalWorkingHrs + " Hr" + " and " + totalWorkingDays + " working days.\n" );
	}
	
	public static void main(String[] args)
	{
		EmployeeWageBuilder companyReliance = new EmployeeWageBuilder();
		companyReliance.computeEmployeeWage("Reliance", 20, 20, 100);
		EmployeeWageBuilder companyDmart = new EmployeeWageBuilder();
		companyDmart.computeEmployeeWage("D-mart", 10, 15, 98);
	}
}
