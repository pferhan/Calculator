import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two whole numbers.");
        System.out.println("First number: ");
        int num1 = scan.nextInt();
        System.out.println("Second number: ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;

        scan.close();

        System.out.println("Sum: " + sum);
    }
}