package com.epam.clean_and_serialization;
import java.util.*;
public class Intrest {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("choose one option");
		System.out.println("1.Simple Interest");
		System.out.println("2.Compound Interest");
		System.out.println("choose ur option");
		switch(scnr.nextInt()) 
		{
			case 1:
				System.out.println("Enter principal amount");
				double principal=scnr.nextDouble();
				System.out.println("Enter rate of interest");
				double rateOfInterest = scnr.nextDouble();
				System.out.println("Enter time ");
				int time = scnr.nextInt();
				double SimpleInterest = SI_CI.si(principal, time, rateOfInterest);
				System.out.println("simple interest is "+SimpleInterest);
				break;
				
			case 2:
				System.out.println("Enter principal amount");
				double compoundPrincipal = scnr.nextDouble();
				System.out.println("Enter rate of interest");
				double compoundRateOfInterest = scnr.nextDouble()/100.0;
				System.out.println("no.of years deposited");
				double compoundNoOfYearsDeposited = scnr.nextDouble();
				System.out.println("compounded times");
				int compoundedTimes = scnr.nextInt();
				double compoundInterest = SI_CI.ci(compoundPrincipal,compoundRateOfInterest,compoundNoOfYearsDeposited,compoundedTimes);
				System.out.println("compound interest is " + compoundInterest);
				break;
				
			default:System.out.println("enter correct option");
					break;
			
		}
		
		
		scnr.close();
	}

}
