package listas_array.exsAfundo;

import java.util.ArrayList;

class Main {
    public static void main (String[] args) {       
        ArrayList<String> Bandas = new ArrayList<>();

        Bandas.add("BTS");
        Bandas.add("Beatles");
        Bandas.add("Iron Mainden");

        Bandas.add(Bandas.indexOf("BTS"), "Capital Inicial");
        System.out.println(Bandas);

        System.out.println(Bandas.contains("BTS"));

        Bandas.clear();
        System.out.println(Bandas);
    }
}

