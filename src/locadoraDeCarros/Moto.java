package locadoraDeCarros;

import java.time.LocalDate;

/**
 * Classe que representa uma moto dentro do estoque.
 * Assim como o carro, a moto tambem herda da classe Veiculo.
 */
public class Moto extends Veiculo {
    private int cilindradas;

    /**
     * Construtor da classe Moto.
     *
     * @param marca marca da moto
     * @param modelo modelo da moto
     * @param anoFabricacao ano de fabricacao da moto
     * @param placa placa da moto

     * @param cor cor da moto
     * @param cilindradas quantidade de cilindradas da moto
     */
    public Moto(int idVeiculo, String marca, String modelo, LocalDate anoFabricacao, String placa, double precoBase, String cor, int cilindradas) {
        super(idVeiculo, marca, modelo, placa, cor, anoFabricacao, precoBase);
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

    @Override
    public String getTipo(){
        return "Moto";
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
                "\nCilindradas: " + getCilindradas() +
                "\nValor final: R$ " + calcularValorFinal();
    }
    public int getCilindradas() {
        return cilindradas;
    }
}
