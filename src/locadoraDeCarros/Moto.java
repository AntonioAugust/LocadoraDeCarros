package locadoraDeCarros;

public class Moto extends Veiculo{
    private int cilindradas;
    public Moto (String marca, String modelo, int anoFabricacao, String placa, double preco, String cor, int cilindradas) {
        super(marca, modelo, anoFabricacao, placa, preco, cor);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorFinal() {
        return getPreco() + (getPreco()* 0.03);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nTipo: Moto" +
                "\nCilindradas " + cilindradas+
                "\nValor final: R$ " + calcularValorFinal();
    }
    public int getCilindradas() {
        return cilindradas;
    }
}
