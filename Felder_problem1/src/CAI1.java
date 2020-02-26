import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI1 {
		
	public void quiz()
	{
		SecureRandom rand  = new SecureRandom();
	    int rand_Numb = rand.nextInt(10); 
		int rand_Numb2 = rand.nextInt(10);	
	    askQuestion(rand_Numb, rand_Numb2);
	}
	
	public static void askQuestion(int rand_Numb, int rand_Numb2)
	{
		
		System.out.printf("How much is %d times %d?\n", rand_Numb, rand_Numb2);
		int correct_Response = rand_Numb * rand_Numb2;
		readResponse(correct_Response);
	}
	
	public static void readResponse(int correct_Response)
	{
		 Scanner scan = new Scanner(System.in);
		 int UserInput = scan.nextInt();
		 isAnswerCorrect(correct_Response, UserInput);
		 scan.close();
	}
	public static void isAnswerCorrect(int correct_Response, int UserInput)
	{
		if (UserInput == correct_Response)
		{
			 displayCorrectResponse();
		}
		else 
		{
			displayIncorrectResponse();
			readResponse(correct_Response);
		}
	}
	public static PrintStream displayCorrectResponse()
	{
	    return System.out.printf("Very good!\n");
	}
	public static PrintStream displayIncorrectResponse()
	{
		return System.out.printf("No. Keep trying\n");
	}
	public static void main(String[] args) 
	{
		CAI1 c = new CAI1();
	    c.quiz();
	}

}
