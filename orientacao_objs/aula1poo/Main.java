package orientacao_objs.aula1poo;

public class Main {
    public static void main(String[] args){
        cao cachorro = new cao();
        cachorro.Nome = "Bobby";
        cachorro.Andar();

        cao dog = new cao("Lulu", 12);
        dog.DadosCao();
    }
}
