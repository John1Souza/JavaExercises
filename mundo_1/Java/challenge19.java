import java.util.Random;
import java.util.Scanner;

public class challenge19 {
    public static void main(String[] args) {
        // Deixando em standby este código que eu achei lindo, mas que infelizmente meus conhecimentos atuais sobre dicionários não permitiram que eu o concluísse.

        // Um professor quer sortear um dos seus quatro alunos para apagar o quadro.
        // Faça um programa que ajude ele, lendo o nome deles e escrevendo o do escolhido.

        // Your array of strings
        String[] students = {"John", "Bryan", "Leon", "Krauser"};
        
        // Create a Random object
        Random random = new Random();

        // Generate a random index within the range of the array length
        int randomIndex = random.nextInt(students.length);

        // Use the random index to select a string from the array
        String selectedString = students[randomIndex];

        // Print the selected string
        System.out.println("Randomly selected string: " + selectedString);

        
    }
}
