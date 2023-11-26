import java.util.Scanner;

public class challenge14 {
    public static void main(String[] args) {
        // Make a program that reads something from the keyboard
        // and show its primitive type on the screen
        // and all possible information about it

        Scanner input = new Scanner(System.in);

        System.out.println("Type any word or sentence here: ");
        var entry = input.nextLine();
        
        System.out.println("Primitive type" + entry.getClass().getSimpleName());
        
        input.close();
    }
}
