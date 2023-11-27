import java.util.Scanner;

public class challenge15 {
    public static void main(String[] args) {
        // car rent:

        // Writte a program which ask a quantity of Km traveled for one car rent and the quantity of days for which it was rented

        // Calculate the price to pay, knowing that the car costs R$60 per day and R$0.15 per km driven

        Scanner input = new Scanner(System.in);

        System.out.println("How many KMs have you traveled: ");
        double kms = input.nextDouble();

        System.out.println("How many days have you traveled: ");
        int days = input.nextInt();

        double priceToPay = (double)((60*days)+(0.15*kms));
        
        System.out.printf("Your invoice considering you have traveled %.2fKms in %d days, is: %.2f", kms, days, priceToPay);
        
        input.close();
    }
}
