package projetopessoas;
public class ProjetoPessoas {

    public static void main(String[] args) {
        
        Rica henrico = new Rica();
        Pobre henpobre = new Pobre();
        Miseravel cristiano = new Miseravel();
        
        
        henrico.pessoa();
        henrico.fazCompras();
                
        henpobre.pessoa();
        henpobre.trabalha();
        
        cristiano.pessoa();
        cristiano.mendiga();
        
    }
    
}
