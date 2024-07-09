package metodo_to_strin;

public class Main {
    public static void main(String[] args){
        String primeira = "Java";
        String segunda = "Csharp";
        //OBJ
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        // comparar a primeira com a segunda
        boolean result = primeira.equals(segunda);
        System.out.println("Primeira é igual a segunda? " + result);

        //comprar a segunda com a terceira
        result = segunda.equals(terceira);
        System.out.println("Segunda é igual a terceira? " + result);
    }
}
