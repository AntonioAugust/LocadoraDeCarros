package locadoraDeCarros;

public class Carro extends Veiculo{
    private int quantidadePortas;
    public Carro (String marca, String modelo, int anoFabricacao, String placa, double preco, String cor, int quantidadePortas){
        super(marca, modelo, anoFabricacao, placa, preco, cor);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public double calcularValorFinal() {
        return getPreco() + (getPreco()*0.05);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados +
                "\nTipo: Carro" +
                "\nQuantidade de portas: " + quantidadePortas +
                "\nValor final: R$ " + calcularValorFinal();
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
