package com.bridgelab;

/**********************************************************************
 * @author mihir
 *	
 * @since 29-June-2021
 * 
 * This class is acting as POJO class.
 * it is having all variables which are related to comapny's employee's.
 **********************************************************************/

public class CompanyEmployeeWage
{
	public final String company;
	public final int employeeWagePerHr;
	public final int daysInMonth;
	public final int maxHrsInMonth;
	public int employeeMonthlyWage;
	
	/**
	 * Name : CompanyEmployeeWage ( Constructor )
	 * 
	 * @param company
	 * @param employeeWagePerHr
	 * @param daysInMonth
	 * @param maxHrsInMonth
	 */
	public CompanyEmployeeWage(String company, int employeeWagePerHr, int daysInMonth, int maxHrsInMonth)
	{
		this.company = company;
		this.employeeWagePerHr = employeeWagePerHr;
		this.daysInMonth = daysInMonth;
		this.maxHrsInMonth = maxHrsInMonth;
	}
	
	public void setTotalEmpWage(int employeeMonthlyWage)
	{
		this.employeeMonthlyWage = employeeMonthlyWage;
	}

	@Override
	public String toString() 
	{
		return "\nTotal employee wage for Company : " + company + " is : " + employeeMonthlyWage + "\n";
	}
	
	
	
}
