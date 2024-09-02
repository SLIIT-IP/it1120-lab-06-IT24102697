import java.util.Scanner;

public class IT24102697Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("The numbers you entered are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}