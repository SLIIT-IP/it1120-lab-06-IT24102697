import java.util.Scanner;

public class IT24102697Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = sum / 10.0;

        System.out.print("The numbers you entered are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}