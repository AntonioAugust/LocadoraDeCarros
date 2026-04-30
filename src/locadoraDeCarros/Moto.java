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
    public Moto(String marca, String modelo, LocalDate anoFabricacao, String placa, double precoBase, String cor, int cilindradas) {
        super(marca, modelo, placa, cor, anoFabricacao, precoBase);
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo(){
        return "Moto";
    }

    @Override
    public String toString() {
        // Usamos o super.toString() para pegar a parte comum e adicionamos o específico
        return super.toString() + String.format(" | Cilindradas: %dcc", cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
