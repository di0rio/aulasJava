package vetor_matriz.vetor;

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        // int valor;
        // int[] dados = new int[5];

        // dados[2] = 9;
        // dados[3] = 7;
        // dados[0] = 6;

        // System.out.println(dados[3]);

        int[] passarosDia = {2,3,0,7,4,1,3,0,2,5,0,1,3,1};

        int totalPassaros = 0;
        int totalPassarosPrimeiraS = 0;
        int totalPassarosSegundaS = 0;

        for(int i = 0; i<14; i++){
            totalPassaros = totalPassaros + passarosDia[0];
        }
        System.out.println(totalPassaros);

        for(int i = 0; i<7; i++){
            totalPassarosPrimeiraS = totalPassarosPrimeiraS + passarosDia[i];
        }
        System.out.println(totalPassarosPrimeiraS);


        for(int i = 7; i<14; i++){
            totalPassarosSegundaS = totalPassarosSegundaS + passarosDia[i];
        }
        System.out.println(totalPassarosSegundaS);

    }
}
