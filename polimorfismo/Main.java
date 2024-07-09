package polimorfismo;
//DIFERENTES FORMAS | MÉTODOS COM MESMOS NOMES, MAS COM AÇÕES DIFERENTES
public class Main {
    public static void main (String[] args) {
        Quadrado q1 = new Quadrado();
        q1.desenhar();

        Circulo c1 = new Circulo();
        c1.desenhar();
    }
}
