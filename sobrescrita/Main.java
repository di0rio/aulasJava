package sobrescrita;

class Linguagem{
    public void mostrarInfo(){
        System.out.println("Lingua Portuguesa");
    }
}
//SOBRESCREVENDO
class Java extends Linguagem{
    public void mostrarInfo(){
        System.out.println("Linguagem Java");
    }
}
//SOBRESCREVENDO
class Python extends Linguagem{
    public void mostrarInfo(){
        System.out.println("Linguagem Python");
    }
}

public class Main {
    public static void main(String[] args){
        Java j1 = new Java();
        j1.mostrarInfo();

        Linguagem l1 = new Linguagem();
        l1.mostrarInfo();

        Python p1 = new Python();
        p1.mostrarInfo();
    }
}
