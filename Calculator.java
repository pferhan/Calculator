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

        System.out.println("Would you like to add (+) or subtract(-)?");
        char operation = scan.next().charAt(0);

        int result;

        if (operation == '+')
        {
            result = num1+num2;
            System.out.println("Result: " + result);
        } else if (operation == '-')
        {
            result = num1-num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid selection");
        }

        scan.close();
    }
}