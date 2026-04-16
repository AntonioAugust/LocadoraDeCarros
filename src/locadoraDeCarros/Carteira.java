package locadoraDeCarros;

public class Carteira {
    private double dinheiro;

    public void Depositar(double quantidade){
        if(quantidade > 0) {
            this.dinheiro += quantidade;
        }
        else{
            System.out.println("Quantidade inválida para deposito");
        }
    }

    public void Remover(double quantidade){
        if((this.dinheiro - quantidade) >= 0){
            this.dinheiro -= quantidade;
        }
        else{
            System.out.println("Você não tem dinheiro o suficiente para essa operação");
        }
    }

    public double getDinheiro(){
        return this.dinheiro;
    }
}