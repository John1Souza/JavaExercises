import java.util.Scanner;

import javax.swing.JOptionPane;

public class challenge10 {
    public static void main(String[] args) {
        // Create a program that reads how much money a person has in their wallet and shows how many dollars they can buy

        double valueInWallet = Double.parseDouble(JOptionPane.showInputDialog("How much money you have in that pocket? "));

        if (valueInWallet >= 1000.00){
            System.out.println("Well...Well...budy, look what we have here...");
            System.out.printf("\nWith R$ %.2f you can buy $ %.2f dollars", valueInWallet, valueInWallet * 5);
        }else {
            System.out.printf("Humpf...look, with this R$ %.2f, you can buy this amount of dollars $ %.2f", valueInWallet, valueInWallet * 5);
        }
    }
}
