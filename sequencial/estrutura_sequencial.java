package sequencial;

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        
        // base = 10.0;
        // altura = 8.0;
        
        // area = (base * altura) / 2;
        // System.out.println(area);
        
        //PRÁTICAS
        System.out.println("");

        int area;
        double base, altura;
        
        System.out.println("Insira a base: "); 
        System.out.println("Insira a altura: "); 
        
        Scanner entrada = new Scanner(System.in);
        base = entrada.nextDouble();
        altura = entrada.nextDouble();

        area = (int) (base * altura) / 2;

        System.out.println(area);

    }
}