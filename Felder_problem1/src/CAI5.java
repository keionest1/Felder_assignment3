import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI5 
{
	static SecureRandom rand  = new SecureRandom();
	static int rand_Numb;
	static int rand_Numb2;
	static int rand_Numb3;
	static Scanner scan = new Scanner(System.in);
	static int comp;
	static float correct_Response;
	static float UserInput;
	static float Score = 0;
	static int tryAgain;
	static int difficulty; 
	static int problemType;
	static int rand_Mix;
	static float max; 
	static float min;
	static int temp;
	
	
	public static void quiz()
	{
		System.out.printf("Please enter a level of difficulty 1,2,3 or 4?\n", difficulty);
		difficulty = scan.nextInt();
		
		int comp = 1;
		int n = 0;
		switch (difficulty) 
		{
		  case 1: n = 10;
			  break;
		  case 2: n = 100;
			  break;
		  case 3: n = 1000;
			  break;
		  case 4: n = 10000;
			  break;
		}
		System.out.printf("Please enter what type of problem you would like to solve 1 = addition;"
				+ "2 = multiplication; 3 = substraction;\n 4 = division; 5 = Mixture of all?\n");
		problemType = scan.nextInt();
		 while (comp < 11)
		 {
			 rand_Numb = rand.nextInt(n); 
			 rand_Numb2 = rand.nextInt(n);
			 rand_Mix = rand.nextInt(4)+1;
			 askQuestion(); 
			 comp = comp +1;
			 
			 if (correct_Response == UserInput)
				{
					Score++;
				}
		 }
		 
		displayCompletionMessage();
	}
	
	public static void askQuestion()
	{
		
	 
		switch(problemType)
		{
		  case 1: System.out.printf("How much is %d plus %d?\n" , rand_Numb, rand_Numb2);
		          correct_Response = rand_Numb + rand_Numb2;
		  		break;
		  case 2: System.out.printf("How much is %d times %d?\n" , rand_Numb, rand_Numb2);
		  		  correct_Response = rand_Numb * rand_Numb2;
		  		break;
		  case 3: System.out.printf("How much is %d Substract %d?\n" , rand_Numb, rand_Numb2);
		          correct_Response = rand_Numb - rand_Numb2;
		  		break;
		  case 4: max = Math.max(rand_Numb, rand_Numb2);
                  min = Math.min(rand_Numb, rand_Numb2);
			      System.out.printf("How much is %.2f divided by %.2f?\n" , max, min);
		          correct_Response = (int)(max / min);
		  		break;
		  case 5: Mixture();
		        break;
		}
			readResponse();
	}
	
	public static void Mixture()
	{
		if (rand_Mix == 1)
	  	{
	  		System.out.printf("How much is %d plus %d?\n" , rand_Numb, rand_Numb2);
	  		correct_Response = rand_Numb + rand_Numb2;
	  	}
	  	else if (rand_Mix == 2) 
	  	{
	  		System.out.printf("How much is %d times %d?\n" , rand_Numb, rand_Numb2);
	  		correct_Response = rand_Numb * rand_Numb2;
	  	}
	  	else if (rand_Mix == 3)
	  	{
	  		System.out.printf("How much is %d Substract %d?\n" , rand_Numb, rand_Numb2);
	  		correct_Response = rand_Numb - rand_Numb2;
	  	}
	  	else if (rand_Mix == 4)
	  	{
	  		max = Math.max(rand_Numb, rand_Numb2);
	        min = Math.min(rand_Numb, rand_Numb2);
	  		System.out.printf("How much is %.2f divided by %.2f?\n" , max, min);
	  		correct_Response = (int)(max / min); 
	  	}
	}
	
	public static void readResponse()
	{
		 UserInput = scan.nextFloat();
		 isAnswerCorrect();
		 
	}
	public static void isAnswerCorrect()
	{
		rand_Numb3 = rand.nextInt(4)+1;
		
			if (UserInput == correct_Response)
			{
				displayCorrectResponse();
			}
			else if (UserInput != correct_Response) 
			{
				displayIncorrectResponse();	
			}
			
	}
	public static PrintStream displayCorrectResponse()
	{
		String randOutput = null; 
		switch(rand_Numb3)
		{
			case 1: randOutput = "Very good!\n";
					break;
			case 2: randOutput = "Excellent!\n";
					break;
			case 3: randOutput = "Nice work!\n";
					break;
			case 4: randOutput = "Keep up the good work!\n";
					break;
		}
	    return System.out.printf(randOutput); 
	}
	public static PrintStream displayIncorrectResponse()
	{
		String randOutput = null; 
		switch(rand_Numb3)
		{
			case 1: randOutput = "No. Please try again.\n";
					break;
			case 2: randOutput = "Wrong. try once more.\n";
					break;
			case 3: randOutput = "Don't give up!\n";
					break;
			case 4: randOutput = "No. Keep trying.\n";
					break;
		}
	    return System.out.printf(randOutput); 
	}
	public static void displayCompletionMessage()
	{
	   		Float result = (Score / 10) * 100;
	   		 
	   		if ((Score/ 10) >= 0.75)
	   		{
	   			System.out.printf("Congratulations, you are ready to go to the next level! You Scored a %.1f%n", result);
	   			System.out.printf("Do you want to start over? Yes = 1, No = 0\n", tryAgain);
	   		}
	   		else 
	   		{
	   			System.out.printf("Please ask your teacher for extra help. You scored a %.1f\n", result);
	   			System.out.printf("Do you want to start over? Yes = 1, No = 0\n", tryAgain);
	   		}
	   		
	   		tryAgain = scan.nextInt();
	   		if(tryAgain == 1)
	   		{
	   			Score = 0;
	   			quiz();
	   		}
	   		else 
	   			System.exit(0);
	   	}
	public static void main(String[] args) 
	{
		quiz();
		
	}
}
