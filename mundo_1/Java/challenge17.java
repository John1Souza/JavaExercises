import java.util.Scanner;

public class challenge17 {
    public static void main(String[] args) {
        // Desafio 17: Faça um programa que leia o comprimento do cateto oposto (co) e do cateto adjacente (ca) de um triângulo retângulo, calcule e mostre o comprimento da hipotenusa.
        // Challenge 17: make a program which read the length of opposite side (co) and of adjacent cathetus (ca) of a rectangle triangle, calculate and show the length of hypotenuse
        Scanner input = new Scanner(System.in);

        System.out.println("Type the value of length of opposite side (co): ");
        double catA = input.nextDouble();

        System.out.println("Type the value of length of adjacent cathetus (ca): ");
        double catB = input.nextDouble();

        double hypo = Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));

        System.out.printf("Based on the length of opposite side (co): %f, adjacent cathetus (ca): %f, the hypotenuse is: %.2f", catA, catB, hypo);
    }
}
