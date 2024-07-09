package herancas.Banco;

                //classes abstratas
 abstract class Conta {
     private double saldo;

     public void setSaldo(double saldo){
         this.saldo = saldo;
     }

     public double getSaldo(){
         return saldo;
     }

    public abstract void imprimeExtrato();
    }



                //Interfaces
// public interface Conta {
//     void depositar(double valor);
//     void sacar(double valor);
//     double getSaldo();
// }

