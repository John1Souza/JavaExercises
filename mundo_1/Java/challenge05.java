import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class challenge05 {
    public static void main(String[] args) {
        // Make a program that reads an integer and displays its successor and predecessor on the screen:

        int inputOne = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        //int inputTwo = Integer.parseInt(JOptionPane.showInputDialog("Type another number: "));
        
        System.out.printf("The successor and predecessor is of %d is : %d,  %d", inputOne, inputOne -1, inputOne + 1);

        
    }
}
