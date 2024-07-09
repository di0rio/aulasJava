package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> animais = new LinkedList<>();

        animais.add("Cavalo");
        animais.add("Gato");
        animais.add("Pedro");
        System.out.println("LinkedList: " + animais);

        animais.add(1, "João");
        System.out.println("LinkedList: " + animais);

    }
}
