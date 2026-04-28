package locadoraDeCarros;
import java.time.LocalDate;

/**
 * Classe base para os veiculos do sistema.
 * Aqui ficam as informacoes que todo veiculo precisa ter, como placa, marca,
 * modelo, ano, valor e se ele ainda esta disponivel no estoque.
 * A classe e abstrata porque nao faz muito sentido cadastrar apenas um veiculo generico.
 * No sistema, o veiculo sera um Carro ou uma Moto.
 */
public abstract class Veiculo implements Comercializavel {
    private int idVeiculo;
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private LocalDate anoFabricacao;
    private double precoBase;

    /**
     * Construtor da classe Veiculo.
     * Esse construtor e usado pelas classes filhas, Carro e Moto.
     * Sempre que um veiculo novo e criado, ele comeca disponivel no estoque.
     *
     * @param marca marca do veiculo
     * @param modelo modelo do veiculo
     * @param anoFabricacao ano de fabricacao do veiculo
     * @param placa placa do veiculo

     * @param cor cor do veiculo
     */
    public Veiculo(int idVeiculo, String marca, String modelo, String placa, String cor, LocalDate anoFabricacao, double precoBase) {
        this.idVeiculo = idVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.precoBase = precoBase;
    }

    /**
     * Mostra as informacoes principais do veiculo.
     * As classes filhas podem usar esse metodo e acrescentar suas proprias informacoes.
     *
     * @return informacoes do veiculo em formato de texto
     */
    public String exibirDados () {

        return "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno de fabricação: " + getAnoFabricacao() +
                "\nPlaca: " + getPlaca() +
                "\nCor: " + getCor();

     }

    /**
     * Calcula o valor final do veículo.
     * Esse meodo fica sem implementação aqui porque cada tipo de veículo
     * pode ter uma regra própria de cálculo.
     * @return valor final do veículo
     */
    @Override
    public abstract double calcularValorFinal();

    public abstract String getTipo();

    public double getPreco(){
        return precoBase;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }
    public int getIdVeiculo(){
        return  idVeiculo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}