import java.util.Scanner;

public class challenge03 {
    public static void main(String[] args) {
        // Create a script that reads two numbers and tries to show the sum between them

        Scanner input = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int numberOne = Integer.parseInt(input.nextLine());

        System.out.println("Type the second number: ");
        int numberTwo = Integer.parseInt(input.nextLine());

        int sum = numberOne + numberTwo;

        System.out.printf("The sum result of %d and %d is %d", numberOne, numberTwo, sum);
        input.close();

    }
}