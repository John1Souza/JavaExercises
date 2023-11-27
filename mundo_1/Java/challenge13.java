import java.util.Scanner;

public class challenge13 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento
        // Make a algorithm who read the salary of a enplyer and show your new salary, with 15% up
        Scanner input = new Scanner(System.in);

        System.out.println("Type your salary here: ");
        double salary = input.nextDouble();
        
        System.out.printf("Your salary with increase is : %.2f", (salary*1.15));
        
        input.close();
    }
}
