package HOT;
import java.util.Scanner;

public class ChatAWhileDriver {

	public static void main(String[] args) {
		//Parallel array length
		final int ARRAY_LENGTH = 6;
		//Array of ints Storing Area Code's
		int[] areaCodes = {262, 414, 608, 715, 815, 920};
		//Array of doubles storing Per-Minute Rates
		double[] rates = {.07, .10, .05, .16, .24, .14};
		//Create Scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter area code");
		//Collect Area code from user
		int inputAreaCode = keyboard.nextInt();
		keyboard.nextLine();
		double userRate = 0;
		//Usering parallel arrays to match area code with rate
		for(int i = 0; i < ARRAY_LENGTH; i++)
		{
			if(inputAreaCode == areaCodes[i])
			{
				userRate += rates[i];
			}
		}
		System.out.println("Please enter length of time for call(in minutes)");
		//Collect length of call
		int inputCallMinutes = keyboard.nextInt();
		keyboard.nextLine();
		//Calc the total Call cost buy multiplying the rate by the length of call
		double totalCallCost = userRate * inputCallMinutes;
	
		
		//Print Results
		System.out.printf("User Rate: $%.02f \nlength: %d \nTotal Call Cost: $%.02f \n",userRate, inputCallMinutes, totalCallCost);
		keyboard.close();
		

	}

}
