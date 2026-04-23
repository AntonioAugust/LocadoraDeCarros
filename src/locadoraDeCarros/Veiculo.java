package locadoraDeCarros;

/**
 * Classe base para os veículos do sistema.
 * Aqui ficam as informações que todo veículo precisa ter, como placa, marca
 * modelo, ano, valor e se ele ainda está disponível no estoque.
 * A classe é abstrata porque não faz muito sentido cadastrar apenas um veículo genérico
 * No sistema, o veículo será um Carro ou uma Moto
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
     * Construtor da classe veículo
     * Esse cosntrutor é usador pelas classes filhas, carro e moto
     * Sempre que um veículo novo é criado, ele começa disponível no estoque
     * @param marca marca do veiculo
     * @param modelo modelo do veiculo
     * @param anoFabricacao ano de fabricacao do veiculo
     * @param placa placa do veiculo
     * @param preco preco base do veiculo
     * @param cor cor de veiculo
     */
    public Veiculo(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor) {
        this.marca= marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.preco = preco;
        this.cor = cor;
        this.disponivel= true;
    }

    /**
     * As classes filhas podem usar esse metodo e acrescentar suas proprias informacoes,
     * como quantidade de portas ou cilindradas
     * @return informações do veículo em formato de texto
     */

    public String exibirDados () {
        String situacao = disponivel ? "Disponivel" : "Vendido";

        return "Marca: " + marca +
                "\nModelo:" + modelo +
                "\nAno de fabricação: " + anoFabricacao +
                "\nPlaca: " + placa +
                "\nCor: " + cor +
                "\nPreço base: R$ " + preco +
                "\nSituação: " + situacao;
     }

    /**
     * Vende o veículo, caso ele ainda esteja disponível.
     * Se o veículo já tiver sido vendido, o sistema apenas avisa e não
     * altera novamente a situação dele.
     */
    @Override
    public void vender() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Venda realizada com sucesso!");
        }else {
            System.out.println("Esse veículo já foi vendido");
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

     public String getMarca(){
        return marca;
    }

     public void setMarca(String marca){
        this.marca = marca;
    }

     public String getModelo(){
        return modelo;
    }

     public void setModelo(String modelo){
        this.modelo = modelo;
    }

     public int getAnoFabricacao() {
        return anoFabricacao;
    }

     public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

     public String getPlaca() {
        return placa;
    }

     public void setPlaca(String placa) {
        this.placa = placa;
    }

     public double getPreco() {
        return preco;
    }

     public void setPreco(double preco) {
        this.preco = preco;
    }

     public String getCor() {
        return cor;
    }

     public void setCor(String cor) {
        this.cor = cor;
    }
}
