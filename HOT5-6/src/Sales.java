import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sales {

	public static void main(String[] args) throws IOException {


		Scanner keyboard = new Scanner(System.in);
		


		
		double[] sales = new double[5];
		System.out.println("Please Enter Weekly Sales");
		double accumulator = 0;
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Day " + (i + 1) + ":");
			sales[i] = keyboard.nextDouble();
			if(sales[i] <= 0)
			{
				System.out.println("Please enter positive number");
				--i;
			}
			accumulator += sales[i];
		
		}
		
		File file = new File("WeeklySales.txt");
		PrintWriter out = new PrintWriter(file);
			
			for(int i = 0; i < 5; i++)
			{
				out.println("Day " + (i+1) + ": " + "$" + sales[i]);
				
				
				System.out.println(sales[i]);
			}
			out.println("Accumulation: $" + accumulator);
			out.close();
			keyboard.close();
			
	
	}

}
