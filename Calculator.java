import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        double num1 = scan.nextDouble();

        System.out.println("Second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Choose an operation: Add(+), Subtract(-), Multiply(*), Divide(/)");
        char operation = scan.next().charAt(0);

        double result;

        if (operation == '+')
        {
            result = num1+num2;
            System.out.println("Result: " + result);
        } else if (operation == '-') {
            result = num1-num2;
            System.out.println("Result: " + result);
        } else if (operation == '*') {
            result = num1*num2;
            System.out.println("Result: " + result);
        } else if (operation == '/') {
            result = num1/num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid selection");
        }

        scan.close();
    }
}