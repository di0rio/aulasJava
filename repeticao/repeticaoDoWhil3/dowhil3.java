package repeticao.repeticaoDoWhil3;

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        int opcao;

        do{
            System.out.println("Digite um valor qulquer ou 99 para sair: ");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }while(opcao != 99);
        }
    }

