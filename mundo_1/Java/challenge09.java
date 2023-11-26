import java.util.Scanner;

import javax.swing.JOptionPane;

public class challenge09 {
    public static void main(String[] args) {
        // Write a program that reads any integer
        // and show your multiplication table on the screen

        int number = Integer.parseInt(JOptionPane.showInputDialog("Type the number who you want to see the multiplication table: "));

        for (int i = 1; i <= 10; i++ ){
            if (i == 1){
                System.out.printf("%d x %d = %d", number, i, number * i);
            }else {
                System.out.printf("\n%d x %d = %d", number, i, number * i);
            }
        }

        System.out.println("\nTake a break...and...here...we...go...");
        System.out.printf("\n%d x 1 = %d", number, number * 1);
        System.out.printf("\n%d x 2 = %d", number, number * 2);
        System.out.printf("\n%d x 3 = %d", number, number * 3);
        System.out.printf("\n%d x 4 = %d", number, number * 4);
        System.out.printf("\n%d x 5 = %d", number, number * 5);
        System.out.printf("\n%d x 6 = %d", number, number * 6);
        System.out.printf("\n%d x 7 = %d", number, number * 7);
        System.out.printf("\n%d x 8 = %d", number, number * 8);
        System.out.printf("\n%d x 9 = %d", number, number * 9);
        System.out.printf("\n%d x 10 = %d", number, number * 10);

    }
}
