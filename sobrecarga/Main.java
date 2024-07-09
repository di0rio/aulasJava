package sobrecarga;

class Desenho {
    // método sem parâmetro
    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // método com parâmetro
    public void mostrar(char simb) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simb);
        }
    }

    // método com 2 parâmetros
    public void mostrar(char simb, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(simb);
        }

    }
}

public class Main {
    public static void main (String[] args) {
        Desenho d1 = new Desenho();
        d1.mostrar();

        d1.mostrar('#');

        d1.mostrar('$', 3);
    }
}
