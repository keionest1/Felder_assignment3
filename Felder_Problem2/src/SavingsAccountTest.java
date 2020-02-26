import java.text.NumberFormat;
public class SavingsAccountTest 
{

	
	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount();

	    saver1.setSB(2000.00);

		SavingsAccount saver2 = new SavingsAccount();

		saver2.setSB(3000.00);

		SavingsAccount.setAIR(0.04);

		

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.println("starting balance of $2000.00 and annual interest rate of 4%\n");

		for(int i=0; i<12; i++) {

			System.out.println(formatter.format(saver1.calculateMonthlyInterest()) + "******" + formatter.format(saver1.getSB())); 

		}



		System.out.println("\n");

		System.out.println("starting balance of $3000.00 and annual interest rate of 4%\n");

		for(int i=0; i<12; i++) {

			System.out.println(formatter.format(saver2.calculateMonthlyInterest()) + "******" + formatter.format(saver2.getSB())); 

		}



		SavingsAccount.setAIR(0.05);

		System.out.println("\nthe following month with an annual interest rate of 5%\n");

		System.out.println(formatter.format(saver1.calculateMonthlyInterest()) + "******" + formatter.format(saver1.getSB())); 



		System.out.println("\n");

		System.out.println("the following month with an annual interest rate of 5%\n");

		System.out.println(formatter.format(saver2.calculateMonthlyInterest()) + "*******" + formatter.format(saver2.getSB())); 

	}


	}


