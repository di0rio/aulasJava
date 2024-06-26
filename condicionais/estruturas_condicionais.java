package condicionais;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main (String[] args) {
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o número...");
        int numero = entrada.nextInt();

        if (numero == x) {
            System.out.println("Parabéns! Você acertou!");
        }

        else{
            System.out.println("Não foi dessa vez :( ! O número é: " + x);
        }
    }
}