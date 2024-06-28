package listas_array.listas;

import java.util.ArrayList;

import java.util.Scanner;

class Main {
    public static void main (String[] args) {       
        ArrayList<String> estados = new ArrayList<>();

        estados.add("Espirito Santo");
        estados.add("Rio de Janeiro");
        estados.add("São Paulo");

        estados.remove("Espirito Santo");

        System.out.println(estados.contains("São Paulo"));
        System.out.println(estados.contains("Ceará"));

        System.out.println(estados);
    }
}
