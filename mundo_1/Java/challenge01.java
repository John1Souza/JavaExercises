import java.util.Scanner;

public class challenge01 {
    public static void main(String[] args) {
        // Create a script that reads a person's name and displays a welcome message according to the value entered.

        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = input.next();
        System.out.println("Hello and Welcome, " + name + "!");


        System.out.println("Hello, world!");

        input.close();
    }
}