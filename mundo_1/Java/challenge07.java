import javax.swing.JOptionPane;

public class challenge07 {
    public static void main(String[] args) {
        // Develop a program that reads a student's two grades, calculates and displays their average

        double gradesOne = Double.parseDouble(JOptionPane.showInputDialog("Type the first grade here: "));
        
        double gradesTwo = Double.parseDouble(JOptionPane.showInputDialog("Type the second grade here: "));

        double average = (double) ((gradesOne + gradesTwo) / 2);

        System.out.printf("The average of %f and %f is %.2f", gradesOne, gradesTwo, average);
    }
}
