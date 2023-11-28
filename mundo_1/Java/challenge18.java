import java.util.Scanner;

public class challenge18 {
    public static void main(String[] args) {
        // Desafio 18: Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo.
        // Challenge 18: Make a program which read any angle and show on the screen her sine, cosine, tangent

        Scanner input = new Scanner(System.in);
        
        System.out.println("Type the value of the angle: ");
        double angle = input.nextDouble();


        double sine = Math.sin(Math.toRadians(angle));
        double cos = Math.cos(Math.toRadians(angle));
        double tan = Math.tan(Math.toRadians(angle));

        System.out.printf("Considering the angle in radians %.2fº\n", Math.toRadians(angle));
        System.out.printf("the corresponding sine is %.2fº\n", sine);
        System.out.printf("the corresponding cosine is %.2fº\n", cos);
        System.out.printf("the corresponding tangent is %.2fº\n", tan);
        input.close();
    }
}
