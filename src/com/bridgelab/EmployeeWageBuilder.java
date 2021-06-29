package com.bridgelab;

/*********************************************
 * @author mihir
 * 
 * With respect to employees attendance,
 * Calculating employee daily and monthly,
 * wage as per their Company's parameters.
 *********************************************/

public class EmployeeWageBuilder
{	
	final static int EMP_FULLTIME_PRESENT = 2;
	final static int EMP_PARTTIME_PRESENT = 1;
	
	private int numberOfCompanys = 0;
	private CompanyEmployeeWage[] companyEmpWageArray;
	
	/**
	 * Name : EmployeeWageBuilder ( Constructor )
	 * Initializing companyEmpWageArray.
	 */
	public EmployeeWageBuilder()
	{
		companyEmpWageArray = new CompanyEmployeeWage[5];
	}
	
	private void addCompanyEmpWage(String company, int employeeWagePerHr, int daysInMonth, int maxHrsInMonth)
	{
		companyEmpWageArray[numberOfCompanys] = new CompanyEmployeeWage(company, employeeWagePerHr, daysInMonth, maxHrsInMonth);
		numberOfCompanys ++;
	}
	
	public void computeEmployeeWage()
	{
		for(int i = 0; i < numberOfCompanys; i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmployeeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
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
	public int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage)
	{
		int workingHrs = 0, totalWorkingHrs = 0, totalWorkingDays = 0;
		
		while(totalWorkingHrs < companyEmployeeWage.maxHrsInMonth && totalWorkingDays < companyEmployeeWage.daysInMonth)
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
				break;
			}
			case EMP_PARTTIME_PRESENT:
			{
				workingHrs = 4;
				break;
			}
			default:
				System.out.println("Employee is absent.");
			}
			totalWorkingHrs += workingHrs;
			System.out.println("Days : " + totalWorkingDays + " Employee Hr : " + workingHrs);
		}
		return totalWorkingHrs * companyEmployeeWage.employeeWagePerHr;
	}

	public static void main(String[] args)
	{
		EmployeeWageBuilder employeeWageBuilderObject = new EmployeeWageBuilder();
		employeeWageBuilderObject.addCompanyEmpWage("D-Mart", 20, 20, 100);
		employeeWageBuilderObject.addCompanyEmpWage("Reliance", 10, 22, 92);
		employeeWageBuilderObject.computeEmployeeWage();
	}
}
