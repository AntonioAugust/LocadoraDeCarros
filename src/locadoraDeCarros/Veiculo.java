package locadoraDeCarros;
import java.time.LocalDate;


public abstract class Veiculo implements Comercializavel {
    private int idVeiculo;
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private LocalDate anoFabricacao;
    private double precoBase;


    public Veiculo(String marca, String modelo, String placa, String cor, LocalDate anoFabricacao, double precoBase) {
        //this.idVeiculo = idVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.precoBase = precoBase;
    }


    @Override
    public String toString() {
        return String.format("ID: %d | %s %s | Placa: %s | Cor: %s",
                idVeiculo, marca, modelo, placa, cor);
    }


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

    public void setIdVeiculo(int idVeiculo){
        this.idVeiculo = idVeiculo;
    }
}