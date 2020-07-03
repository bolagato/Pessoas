package projetopessoas;

public class Pobre extends Pessoa{
    public void trabalha(){
        System.out.println("O pobre está trabalhando");
    }
    @Override
    public void pessoa(){
        System.out.println("O pobre está vivo!");
    }
}
