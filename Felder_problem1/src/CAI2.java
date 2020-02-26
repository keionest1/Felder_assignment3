import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI2 
{
	public static void quiz()
	{
		SecureRandom rand  = new SecureRandom();
	    int rand_Numb = rand.nextInt(10); 
		int rand_Numb2 = rand.nextInt(10);
		int rand_Numb3 = rand.nextInt(4)+1;
	    askQuestion(rand_Numb, rand_Numb2, rand_Numb3);
	}
	
	public static void askQuestion(int rand_Numb, int rand_Numb2, int rand_Numb3)
	{
		
		System.out.printf("How much is %d times %d?\n", rand_Numb, rand_Numb2);
		int correct_Response = rand_Numb * rand_Numb2;
		readResponse(correct_Response, rand_Numb3);
	}
	
	public static void readResponse(int correct_Response, int rand_Numb3)
	{
		 Scanner scan = new Scanner(System.in);
		 int UserInput = scan.nextInt();
		 isAnswerCorrect(correct_Response, UserInput, rand_Numb3);
		 scan.close();
	}
	public static void isAnswerCorrect(int correct_Response, int UserInput, int rand_Numb3)
	{
		
		if (UserInput == correct_Response)
		{
			 displayCorrectResponse(rand_Numb3);
		}
		else 
		{
			displayIncorrectResponse(rand_Numb3);
			readResponse(correct_Response, rand_Numb3);
		}
	}
	public static PrintStream displayCorrectResponse(int rand_numb3)
	{
		String randOutput = null; 
		switch(rand_numb3)
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
	public static PrintStream displayIncorrectResponse(int rand_numb3)
	{
		String randOutput = null; 
		switch(rand_numb3)
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
	public static void main(String[] args) 
	{
		quiz();
	}

}

	

