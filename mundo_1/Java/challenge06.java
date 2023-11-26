import javax.swing.JOptionPane;

public class challenge06 {
    public static void main(String[] args) {
        // Create an algorithm that reads a number and shows its double, triple and square root:

        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number here: "));

        int twice = number * 2;
        int triple = number * 3;
        double square = Math.sqrt(number);
        double squareOther = Math.pow(number, (1/2));
        System.out.printf("The double, triple and square root of the number %d are: %d, %d, %f, %f", number, twice, triple, square, squareOther);
    }
}
