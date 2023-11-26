import javax.swing.JOptionPane;

public class challenge11 {
    public static void main(String[] args) {
        // Write a program that reads the width and height of a wall in meters, calculates its area and the amount of paint needed to paint it, knowing that each liter of paint paints an area of 2m²

        double height = Double.parseDouble(JOptionPane.showInputDialog("Type the height of your wall: "));

        double width = Double.parseDouble(JOptionPane.showInputDialog("Type the width of your wall: "));

        double tintAmount = (width * height)/2;

        System.out.printf("Considering your wall have %.2fm of height and %.2fm of width, you will need %.2fL of tint.", height, width, tintAmount);
    }
}
