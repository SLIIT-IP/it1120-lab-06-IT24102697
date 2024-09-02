import java.util.Scanner;

public class IT24102697Lab6Q3 {
    public static void main(String[] args) {
       
	  //Create a Scanner object called value
	   Scanner value = new Scanner(System.in);
       System.out.println("Enter positive integers (terminate input with -99):");
		
		//Declare variables
		int number;
        int count = 0;
        double sumOfSquares = 0;
		double rootMeanSquare;
        
		//Use (true) to repeat the loop until the condition become true
		while (true) {			
		System.out.print("Enter a number: "); //Take user inputs
		number = value.nextInt();
             
            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }
            sumOfSquares += number * number;
            count++;
        }

        if (count > 0) {
            rootMeanSquare = Math.sqrt(sumOfSquares / count); //Calculate rootMeanSquare
			System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " +  rootMeanSquare); //Display output
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}