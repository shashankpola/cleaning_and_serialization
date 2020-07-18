package com.epam.clean_and_serialization;
import java.util.*;
public class HouseCons {
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("area of house");
		double area= scnr.nextDouble();
		System.out.println("want a fully automated home(yes/no)");
		String aHome = scnr.next().toLowerCase();
		boolean fAH;
		if("yes".compareTo(aHome) == 0)
			fAH= true;
		else
			fAH= false;
		scnr.nextLine();
		System.out.println("Enter material standard");
		String materialStandard = scnr.nextLine();
		double conCost = Housecost.cost(materialStandard,area,fAH);
		System.out.println("cost is " + conCost);
		scnr.close();
	}
}
