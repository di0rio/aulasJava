package orientacao_objs.aula1poo;

import java.util.Scanner;

// class Main {
//     public static void main (String[] args) {
        // podemos gerar objs nas classes
        public class cao {
            String Nome;
            String Cor;
            int idade;
            double peso;

            //metodos construtores
            public cao(){
                Cor = "Amarelo";
            }

            public cao(String Nome, int idade){
                this.Nome = Nome;
                this.idade = idade;
            }

            public void Andar(){
                System.out.println("Estou andando..." + Cor);
            }

            public void DadosCao(){
                System.out.println(Nome + " " + idade);
            }
        }
//     }
// }