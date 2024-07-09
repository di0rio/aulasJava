package herancas.exemploPratico;

public class Main {
    public static void main(String[] args){
      Dog c = new Dog();
      c.setNome("Bidu");  

      Gato g = new Gato();
      g.setNome("Garfield");

      c.mostrar();
      g.mostrar();
    }
}
