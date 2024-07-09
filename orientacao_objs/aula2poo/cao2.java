package orientacao_objs.aula2poo;

        public class cao2 {
            private int idade;

            public void setidade(int i){
                idade = i;
            }

            public int getidade(){
                return idade;
            }

            public void Andar(){
                System.out.println("Estou andando...");
            }

            public boolean VerificarIdade(){
                if(idade > 10){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
