import java.util.Scanner;

public class challenge21 {
    public static void main(String[] args) {
        // Temperature conversor: writte a program who convert an temperature typed on ºC to ºF

        Scanner input = new Scanner(System.in);

        System.out.println("Type any word or sentence here: ");
        int tempCeslsius = input.nextInt();
        double temConversion = ((tempCeslsius * (9.0/5.0)) + 32);
        System.out.printf("%dºC converted to ºF is : %.2fºF", tempCeslsius, temConversion);
        
        input.close();
    }
}
