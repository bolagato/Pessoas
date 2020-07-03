package projetopessoas;

public class Miseravel extends Pessoa{
    public void mendiga(){
        System.out.println("O mendigo está mendigando");
    }
    @Override
    public void pessoa(){
        System.out.println("O mendigo está vivo");
    }
}
