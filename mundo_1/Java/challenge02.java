import java.util.Scanner;

public class challenge02 {
    public static void main(String[] args) {
        // Create a script that reads a person's day, month and year of birth and displays a message with the formatted data

        Scanner input = new Scanner(System.in);

        System.out.println("Type your birth day: ");
        var day = input.next();

        System.out.println("Type your birth month: ");
        var month = input.next();
        
        System.out.println("Type your year of birth: ");
        var year = input.next();
        
        System.out.printf("You're born on %s/%s/%s", month, day,  year);

        input.close();

    }
}