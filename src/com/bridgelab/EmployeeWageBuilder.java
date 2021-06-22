package com.bridgelab;

/**
 * @author mihir
 * With respect to employees attendance,
 * Calculating employee daily and monthly wage.
 */
public class EmployeeWageBuilder
{	
	static int EMP_FULLTIME_PRESENT = 2;
	static int EMP_PARTTIME_PRESENT = 1;
	static int WAGE_PER_HR = 20;
	static int DAILY_WORKING_HRS = 8;
	
	static int employeeDailyWage = 0;
	static int workingHrs = 0;
	
	public static void main(String[] args)
	{
		/*
		 *Generating random number using math.random(),
		 *Converting it to nearest possible integer number using Math.floor(),
		 *By doing % 3 we will only get either number 0 , 1 or 2.  
		*/
		int employeeChceck =(int) Math.floor(Math.random() * 10) % 3;
		
		
		if(EMP_FULLTIME_PRESENT == employeeChceck)
		{	
			workingHrs = 8;
			System.out.println("Employee is full time present.");
			employeeDailyWage = WAGE_PER_HR * DAILY_WORKING_HRS;
			System.out.println("Daily wage of an full timer employee is : " + employeeDailyWage + " Rs.");
		}
		else if (EMP_PARTTIME_PRESENT == employeeChceck)
		{
			workingHrs = 4;
			System.out.println("Employee is part time present.");
			employeeDailyWage = WAGE_PER_HR * workingHrs;
			System.out.println("Daily wage of an part timer employee is : " + employeeDailyWage + " Rs.");
		}
		else
		{	
			workingHrs = 0;
			System.out.println("Employee is absent.");
		}
	}
}
