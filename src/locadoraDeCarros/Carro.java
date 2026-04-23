package locadoraDeCarros;

/**
 * Classe que representa um carro dentro do estoque.
 * Ela herda da classe Veiculo, então ja possui placa, marca, modelo,
 * ano, valor base e disponibilidade. Alem disso, o carro possui uma
 * informacao propria: a quantidade de portas.
 */
public class Carro extends Veiculo {
    private int quantidadePortas;

    /**
     * Construtor da classe Carro.
     *
     * @param marca marca do carro
     * @param modelo modelo do carro
     * @param anoFabricacao ano de fabricacao do carro
     * @param placa placa do carro
     * @param preco preco base do carro
     * @param cor cor do carro
     * @param quantidadePortas quantidade de portas do carro
     */
    public Carro(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor, int quantidadePortas) {
        super(marca, modelo, anoFabricacao, placa, preco, cor);
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * Calcula o valor final do carro.
     * Para diferenciar os tipos de veiculos, usamos uma pequena taxa sobre
     * o valor base. No caso do carro, foi usada uma taxa de 5%.
     *
     * @return valor final do carro
     */
    @Override
    public double calcularValorFinal() {
        return getPreco() + (getPreco() * 0.05);
    }

    /**
     * Mostra os dados completos do carro.
     * Primeiro sao exibidas as informacoes gerais do veiculo e depois
     * as informacoes especificas do carro.
     *
     * @return dados completos do carro
     */
    @Override
    public String exibirDados() {
        return super.exibirDados() +
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
