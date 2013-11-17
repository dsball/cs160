//P3 Asignment
//Author: Daniel Ball
//Date:   Sep 6, 2013
//Class:  CS160
//Email:  dsball@rams.colostate.edu

import java.util.Scanner;
import java.text.DecimalFormat;

public class P3 {

	public static void main(String[] args) {
		//I/O
		
		//		Instantiate a single Scanner object to read console input.
		Scanner keyboard = new Scanner(System.in);
		
		//		Print the prompt shown below and ask the user for their gross salary.
        //		The gross salary represents dollars, which can be entered with or without decimal points.
		System.out.printf("Gross Salary: ");
		double gross = keyboard.nextDouble();
		
		//		Print the prompt shown below and ask the user for the number of exemptions.
		//		The number of exemptions is an integer.
		System.out.printf("Number of Exemptions: ");
		int exemptions = keyboard.nextInt();
		
		//		Print the prompt shown below and ask the user for their interest income.
		//		The interest income represents dollars, which can be entered with or without decimal points.
		System.out.printf("Interest Income: ");
		double interest = keyboard.nextDouble();
		
		//		Print the prompt shown below and ask the user for their capital gains income.
		//		The capital gains represents dollars, which can be entered with or without decimal points.
		System.out.printf("Capital Gains: ");
		double capital = keyboard.nextDouble();
		
		//		Print the prompt shown below and ask the user for the amount of charitable contributions.
		//		The charitable contributions represents dollars, which can be entered with or without decimal points.
		System.out.printf("Charitable Contributions: ");
		double charity = keyboard.nextDouble();
		//CALCULATIONS
		//		Perform the calculation of federal total income, as shown in the Formula section.
		double incomeTotal = gross + interest + capital;

		//		Perform the calculation of the federal adjusted income, as shown in the Formula section.
		double incomeAdjusted = incomeTotal - charity - (exemptions * 1500.00);
		
		//		Perform the calculation of the federal total tax, as shown in the Formula section.
		double taxTotal = 0;
		
		if(incomeAdjusted > 45000){
			taxTotal = 6680 + 0.28*(incomeAdjusted-45000);
		}
		else if(incomeAdjusted > 25000){
			taxTotal = 2080 + 0.23*(incomeAdjusted-25000);
		}
		else if(incomeAdjusted > 12000){
			taxTotal = 0.16*(incomeAdjusted-12000);
		}
		else{;}
		
		//		Perform the calculation of the state income tax, as shown in the Formula section.
		double taxState = 0;
		if(incomeAdjusted > 0)
			taxState = .05 * incomeAdjusted;
		
		//		Print out the total income, adjusted income, total tax, and state tax.
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Total Income: $" + df.format(incomeTotal));
		System.out.println("Adjusted Income: $" + df.format(incomeAdjusted));
		System.out.println("Total Tax: $" + df.format(taxTotal));
		System.out.println("State Tax: $" + df.format(taxState));

	}

}
