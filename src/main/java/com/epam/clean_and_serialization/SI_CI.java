package com.epam.clean_and_serialization;
public class SI_CI {
	public static double si(double Principal,int time,double rateOfInterest)
		{
			return (Principal*time*rateOfInterest)/(float)100;
		}
	public static double ci(double Principal,double rateOfInterest,double noOfYearsDeposited,int compoundedTimes)
		{
			return Principal*Math.pow((1+rateOfInterest/noOfYearsDeposited),compoundedTimes*noOfYearsDeposited);
		}
	}