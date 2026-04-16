package locadoraDeCarros;

public class Main {
    static void main(){
        Carteira minhaCarteira = new Carteira();
        minhaCarteira.Depositar(100);
        minhaCarteira.Remover(50);
        System.out.printf("Quantidade de dinheiro disponível: " + minhaCarteira.getDinheiro());
    }
}
