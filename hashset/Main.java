package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(6);
        numeros.add(33);
        numeros.add(2);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
