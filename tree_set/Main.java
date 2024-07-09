package tree_set;

import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        //ARVORE
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(7);

        System.out.println("TreeSet: " + numeros);

        boolean result = numeros.remove(9);
        System.out.println("Removeu?? " + result);

    //  result = numeros.removeAll(numeros);
    }
}
