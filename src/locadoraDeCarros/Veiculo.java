package locadoraDeCarros;

/**
 * Classe base para os veiculos do sistema.
 * Aqui ficam as informacoes que todo veiculo precisa ter, como placa, marca,
 * modelo, ano, valor e se ele ainda esta disponivel no estoque.
 * A classe e abstrata porque nao faz muito sentido cadastrar apenas um veiculo generico.
 * No sistema, o veiculo sera um Carro ou uma Moto.
 */
public abstract class Veiculo implements Comercializavel {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String placa;
    private double preco;
    private String cor;
    private boolean disponivel;

    /**
     * Construtor da classe Veiculo.
     * Esse construtor e usado pelas classes filhas, Carro e Moto.
     * Sempre que um veiculo novo e criado, ele comeca disponivel no estoque.
     *
     * @param marca marca do veiculo
     * @param modelo modelo do veiculo
     * @param anoFabricacao ano de fabricacao do veiculo
     * @param placa placa do veiculo
     * @param preco preco base do veiculo
     * @param cor cor do veiculo
     */
    public Veiculo(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPlaca(placa);
        setPreco(preco);
        setCor(cor);
        this.disponivel= true;
    }

    /**
     * Mostra as informacoes principais do veiculo.
     * As classes filhas podem usar esse metodo e acrescentar suas proprias informacoes.
     *
     * @return informacoes do veiculo em formato de texto
     */
    public String exibirDados () {
        String situacao = disponivel ? "Disponivel" : "Vendido";

        return "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno de fabricação: " + getAnoFabricacao() +
                "\nPlaca: " + getPlaca() +
                "\nCor: " + getCor() +
                "\nPreço base: R$ " + getPreco() +
                "\nSituação: " + situacao;
     }

    /**
     * Vende o veiculo, caso ele ainda esteja disponivel.
     * Se o veiculo ja tiver sido vendido, o sistema apenas avisa e nao
     * altera novamente a situacao dele.
     *
     * @param cliente cliente que esta comprando o veiculo
     */
    @Override
    public void vender(Cliente cliente) {
        if (!disponivel) {
            System.out.println("Esse veículo já foi vendido");
            return;
        }

        double valorFinal = calcularValorFinal();

        if (cliente.getCarteira().getDinheiro() >= valorFinal) {
            cliente.getCarteira().Remover(valorFinal);
            disponivel = false;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Cliente não possui dinheiro suficiente");
        }
    }
    /**
     * Calcula o valor final do veículo.
     * Esse meodo fica sem implementação aqui porque cada tipo de veículo
     * pode ter uma regra própria de cálculo.
     * @return valor final do veículo
     */
    @Override
    public abstract double calcularValorFinal();

    /**
     * Retorna a marca do veiculo.
     *
     * @return marca do veiculo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Altera a marca do veiculo.
     *
     * @param marca nova marca do veiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna o modelo do veiculo.
     *
     * @return modelo do veiculo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Altera o modelo do veiculo.
     *
     * @param modelo novo modelo do veiculo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Retorna o ano de fabricacao do veiculo.
     *
     * @return ano de fabricacao do veiculo
     */
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Altera o ano de fabricacao do veiculo.
     *
     * @param anoFabricacao novo ano de fabricacao do veiculo
     */
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    /**
     * Retorna a placa do veiculo.
     *
     * @return placa do veiculo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Altera a placa do veiculo.
     *
     * @param placa nova placa do veiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Retorna o preco base do veiculo.
     *
     * @return preco base do veiculo
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Altera o preco base do veiculo.
     *
     * @param preco novo preco base do veiculo
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna a cor do veiculo.
     *
     * @return cor do veiculo
     */
    public String getCor() {
        return cor;
    }

    /**
     * Altera a cor do veiculo.
     *
     * @param cor nova cor do veiculo
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}