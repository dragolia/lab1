// Lab 1 CISC181
// 9-9-16
// Lab group: Jonathan Famiglietti, David Ragolia, Dean DeLucia 

// So the scanner works...
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        // Here the user inputs how many years they will be working.		
		System.out.println("Please enter the amount of year you will work.");
		int YearsToWork = input.nextInt();
		
		// Here the user will input their annual return.
		System.out.println("Please enter the annual return you will receive.");
		double AnnualReturn1 = input.nextDouble();
		while (AnnualReturn1 > .20 || AnnualReturn1 < 0 ) {
			System.out.println("Please enter a number up to .20");
			AnnualReturn1 = input.nextDouble();
		}
		
		// The user will input how long they wish to draw money.
		System.out.println("How long do you want to draw?");
		int DrawPeriod = input.nextInt();
		
		// This is where the user will input the REQUIRED income.
		System.out.println("Please enter required income.");
		int MonthlyIncome = input.nextInt();
		
		// The user will input their Social Security income here.
		System.out.println("Please enter monthly SSI income.");
		int SSIIncome = input.nextInt();
		
		// Here the user will input their expected average return after they have retired.
		System.out.println("Please enter your expected average return on investment after retirement.");
		double AnnualReturn2 = input.nextDouble();
		while (AnnualReturn2 > .03 || AnnualReturn2 < 0 ) {
			System.out.println("Please enter a number up to .03");
			AnnualReturn2 = input.nextDouble();
		}
		
		int CompoundingPeriod = 12;	
		double TotalNeeded = (MonthlyIncome-SSIIncome)*((1-Math.pow(1/(1+(AnnualReturn2/CompoundingPeriod)),(DrawPeriod*CompoundingPeriod)))/(AnnualReturn2/CompoundingPeriod));	
		double Md = TotalNeeded*((AnnualReturn1/CompoundingPeriod)/(Math.pow(1+(AnnualReturn1/CompoundingPeriod),(YearsToWork*CompoundingPeriod))-1));
		
		// And finally...The output will be the calculation above with the variables input throughout the program. 
		System.out.println("You will need to save " + Md + " to have the required amount of money to live for "+DrawPeriod+" years");
	}

	}
