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
	final static int WAGE_PER_HR = 20;
	final static int MONTHLY_WORKING_DAY = 20;
	final static int MAX_HRS_IN_MONTH = 100;
	
	int employeeDailyWage = 0;
	int workingHrs = 0;
	int employeeMonthlyWage = 0;
	int totalWorkingHrs = 0;
	int totalWorkingDays = 0;
	
	/**
	 * Name : computeEmployeeWage
	 * 
	 * Description : Method calculate employee monthly wage.
	 * 
	 * Algorithm : First check if employee is full timer, part timer or absent,
	 * every category has different working hr's and wage per hr,
	 * monthly wage is calculated only if employee is completing 100 hrs or 20 working days in a month.
	 * 
	 * Modification : Last commit 27-June-2021
	 */
	public void computeEmployeeWage()
	{
		while(totalWorkingHrs < MAX_HRS_IN_MONTH && totalWorkingDays < MONTHLY_WORKING_DAY)
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
				employeeDailyWage = WAGE_PER_HR * workingHrs;
				System.out.println("Daily wage of an full timer employee is : " + employeeDailyWage + " Rs.");
				employeeMonthlyWage += employeeDailyWage;
				break;
			}
			case EMP_PARTTIME_PRESENT:
			{
				workingHrs = 4;
				System.out.println("Employee is part time present.");
				employeeDailyWage = WAGE_PER_HR * workingHrs;
				System.out.println("Daily wage of an part timer employee is : " + employeeDailyWage + " Rs.");
				employeeMonthlyWage += employeeDailyWage;
				break;
			}
			default:
				System.out.println("Employee is absent.");
			}
			totalWorkingHrs += workingHrs;
		}
		System.out.println("\nEmployee monthly wage is : " + employeeMonthlyWage + " Rs for " + totalWorkingHrs + " Hr" + " and " + totalWorkingDays + " working days." );
	}
	
	public static void main(String[] args)
	{
		EmployeeWageBuilder employeeWageBuilderObject = new EmployeeWageBuilder();
		employeeWageBuilderObject.computeEmployeeWage();
	}
}
