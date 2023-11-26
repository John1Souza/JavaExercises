import javax.swing.JOptionPane;

public class challenge08 {
    public static void main(String[] args) {
        // Write a program that reads a value in meters and displays it converted into centimeters and millimeters

        double meters = Double.parseDouble(JOptionPane.showInputDialog("Type the value in meters for conversion: "));

        double metersToMillimeters = (meters*1000);
        double metersToKms = (meters/1000);


        JOptionPane.showMessageDialog(null, meters + "m converted to Millimeters is :" + metersToMillimeters + "mm");
        JOptionPane.showMessageDialog(null, meters + "m converted to Kms is :" + metersToKms + "Km");


        
        System.out.printf("%.2f m converted to Millimeters is : %.2fmm", meters, metersToMillimeters);
        System.out.printf("\n%.2f m converted to Kms is : %.2fKm", meters, metersToKms);
    }
}
