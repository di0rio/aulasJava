package herancas.Banco;

public class Main {
    public static void main(String[] args){
                //classes abstratas
        Conta cp = new Poupanca();
        cp.setSaldo(6000);
        cp.imprimeExtrato();

                //interfaces
    // Conta cp = new Poupanca();
    // cp.depositar(732);
    // cp.sacar(8);
    // cp.getSaldo();
    // }
}
}
