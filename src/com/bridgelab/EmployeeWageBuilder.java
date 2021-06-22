package com.bridgelab;

/**
 * @author mihir
 * With respect to employees attendance,
 * Calculating employee daily and monthly wage.
 */
public class EmployeeWageBuilder
{	
	final static int EMP_FULLTIME_PRESENT = 2;
	final static int EMP_PARTTIME_PRESENT = 1;
	final static int WAGE_PER_HR = 20;
	
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
		
		switch (employeeChceck)
		{
		case EMP_FULLTIME_PRESENT:
		{
			workingHrs = 8;
			System.out.println("Employee is full time present.");
			employeeDailyWage = WAGE_PER_HR * workingHrs;
			System.out.println("Daily wage of an full timer employee is : " + employeeDailyWage + " Rs.");
			break;
		}
		case EMP_PARTTIME_PRESENT:
		{
			workingHrs = 4;
			System.out.println("Employee is part time present.");
			employeeDailyWage = WAGE_PER_HR * workingHrs;
			System.out.println("Daily wage of an part timer employee is : " + employeeDailyWage + " Rs.");
			break;
		}
		default:
			System.out.println("Employee is absent.");
		}
	}
}
