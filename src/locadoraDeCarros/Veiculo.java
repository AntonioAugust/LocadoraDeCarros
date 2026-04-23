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

    public Veiculo(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor) {
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPlaca(placa);
        setPreco(preco);
        setCor(cor);
        this.disponivel= true;
    }

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
     * Vende o veículo, caso ele ainda esteja disponível.
     * Se o veículo já tiver sido vendido, o sistema apenas avisa e não
     * altera novamente a situação dele.
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
