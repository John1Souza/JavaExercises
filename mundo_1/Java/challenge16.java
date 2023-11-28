import java.util.Scanner;

//import javax.swing.JOptionPane;

public class challenge16{
    public static void main(String[] args) {
        // Challenge 16: Make a program which read any royal number from keyboard and show on screen your entire portion dollars $%.2f", valueInWallet, valueInWallet * 5);

        Scanner input = new Scanner(System.in);

        System.out.print("Type the number: ");
        double royal = input.nextDouble();

        System.out.printf("The entire portion of %f is : $%.2f", royal, royal);

        input.close();

    }
}
