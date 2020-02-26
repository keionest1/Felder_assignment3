
public class SavingsAccount 
{
	private static double annualInterestRate;
	private  double savingsBalance;
	
	public double calculateMonthlyInterest()
	{
		double MonthlyInterest = savingsBalance * annualInterestRate / 12;
		savingsBalance = savingsBalance + MonthlyInterest;
	     return savingsBalance;	
	}
	public double getAIR()
	{
		return annualInterestRate;
	}
	public static void setAIR(double annualInterestRate)
	{
		SavingsAccount.annualInterestRate = annualInterestRate; 
	}
	
	public double getSB()
	{
		return savingsBalance;
		
	}
	public void setSB(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	public static void modifyInterestRate(double newAnnualInterestRate)
	{
		SavingsAccount.annualInterestRate = newAnnualInterestRate;
	}
	
	
}
