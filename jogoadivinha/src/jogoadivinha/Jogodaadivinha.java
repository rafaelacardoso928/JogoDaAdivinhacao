
package jogoadivinha;

import java.util.Random;
import java.util.Scanner;

public class Jogoadivinha {

    public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;
        System.out.println("Vamos começar o jogo, escolha um número de 1 a 10");

        Scanner scanner = new Scanner(System.in);
        int palpite = 0;
        int contador = 0;

        while (palpite != numeroSecreto) {
            contador++;
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você muita sorte! " + numeroSecreto + " em " + contador + " tentativas. Vamos mais uma, dessa vez você vai errar!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Número baixo, tente novamente!");
            } else {
                System.out.println("Número alto, tente novamente!");
            }
        }

        scanner.close();
    }
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
