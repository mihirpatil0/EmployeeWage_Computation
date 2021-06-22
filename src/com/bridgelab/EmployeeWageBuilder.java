package com.bridgelab;

/**
 * @author mihir
 * With respect to employees attendance,
 * Calculating employee daily and monthly wage.
 */
public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{
		int EMP_FULLTIME_PRESENT = 1;
		int WAGE_PER_HR = 20;
		int DAILY_WORKING_HRS = 8;
		
		int employeeDailyWage = 0;
		
		/*
		 *Generating random number using math.random(),
		 *Converting it to nearest possible integer number using Math.floor(),
		 *By doing % 2 we will only get either number 0 or 1.  
		*/
		int employeeChceck =(int) Math.floor(Math.random() * 10) % 2;
		
		if(EMP_FULLTIME_PRESENT == employeeChceck)
		{
			System.out.println("Employee is full time present.");
			employeeDailyWage = WAGE_PER_HR * DAILY_WORKING_HRS;
			System.out.println("Daily wage of an full timer employee is : " + employeeDailyWage + " Rs.");
		}
		else
		{
			System.out.println("Employee is absent.");
		}
	}
}
