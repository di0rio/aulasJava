package orientacao_objs.aula2poo;

public class Main {
   public static void main(String[] args){
      cao2 cachorro = new cao2();
      cachorro.setidade(5);

      if(cachorro.VerificarIdade()){
       System.out.println("ele é veio!"); 
    }
      else{
       System.out.println("ele é novin!"); 
    }
}
}