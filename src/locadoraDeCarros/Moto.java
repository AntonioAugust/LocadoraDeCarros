package locadoraDeCarros;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor, int cilindradas) {
        super(marca, modelo, anoFabricacao, placa, preco, cor);
        this.cilindradas = cilindradas;
    }

    /**
     * Calcula o valor final da moto.
     * Para a moto, usamos uma taxa menor que a do carro, de 3% sobre o valor base
     * @return valor final da moto
     */
    @Override
    public double calcularValorFinal() {
        return getPreco() + (getPreco()* 0.03);
    }

    /**
     * Mostra os dados completos da moto.
     * Reaproveitamos as informações gerais da classe Veiculo e acrescentamos
     * as cilindradas, que são uma característica específica da moto.
     * @return texto com os dados completos da moto
     */
    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nTipo: Moto" +
                "\nCilindradas: " + cilindradas +
                "\nValor final: R$ " + calcularValorFinal();
    }
    public int getCilindradas() {
        return cilindradas;
    }
}
