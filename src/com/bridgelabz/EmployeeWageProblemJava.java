package com.bridgelabz;

public class EmployeeWageProblemJava 
{

	public static void main(String[] args) 
	{
		System.out.println("Employee Wage Computation Problem On Java");
		int empCheck = (int)Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) 
		{
			System.out.println("Employee is Present");
		}
		else 
		{
		System.out.println("Employee is Absent");
		}
	}

}
