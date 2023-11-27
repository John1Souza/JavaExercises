import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        // Make a program that reads a product price and show your new price, with 5% of discount
        
        Scanner input = new Scanner(System.in);

        System.out.println("Type the product price you want to know her discount: ");
        double price = input.nextDouble();
        //double discount = ;
        System.out.printf("This product price with discount is : %f", (price*0.95));
        
        input.close();
    }
}
