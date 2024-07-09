package herancas.Banco;

                //classes abstratas
 public class Poupanca extends Conta{
     public void imprimeExtrato(){
        System.out.println("Saldo: " + this.getSaldo());
     }
}

                //interfaces 
// public class Poupanca implements Conta{
//     private double saldo;

//     public void depositar(double valor){
//         this.saldo += valor;
//     }

//     public double getSaldo(){
//         return this.saldo;
//     }

//     public void sacar(double valor){
//         this.saldo -= valor;
//     }
// }
