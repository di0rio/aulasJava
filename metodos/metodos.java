package metodos;

import java.util.Scanner;

class Main {
    // void = sem reotorno | não devolve nada
    public static int somar(int a, int b){
        return (a + b);
    }

//===================================================//
    public static void main (String[] args) {
        int total = Main.somar(10, 50);
        System.out.println(total);
    }
}