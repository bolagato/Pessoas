package projetopessoas;

public class Rica extends Pessoa{
    protected double dinheiro;
    
    public void fazCompras(){
        System.out.println("O Rico está comprando");
    }
    @Override
    public void pessoa(){
        System.out.println("O rico está vivo!");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

       
}
