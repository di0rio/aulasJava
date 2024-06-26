package condicional.aninhada;

import java.util.Scanner;
import java.util.Random;

// IF E ELSE

class Main {
    public static void main (String[] args) {
        int nota = 2;

        if (nota >= 5){
            System.out.println("Aprovado!");
        }
        else if(nota >= 3 || nota < 5){
            System.out.println("Recuperação!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }
}