package locadoraDeCarros;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Veiculo implements locadoraDeCarros.Comercializavel {
    protected String exibirDados;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String placa;
    private double preco;
    private String cor;
    private boolean disponivel;

    public Veiculo(String marca, String modelo, int anoFabricacao, String placa, double preco, String cor) {
        this.marca= marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.preco = preco;
        this.cor = cor;
    }

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

     public void vender() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Venda realizda com sucesso!");
        }else {
            System.out.println("esse veículo já foi vendido");
        }
     }

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
