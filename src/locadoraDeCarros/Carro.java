package locadoraDeCarros;

import java.time.LocalDate;

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
     * @param cor cor do carro
     * @param quantidadePortas quantidade de portas do carro
     */
    public Carro(String marca, String modelo, LocalDate anoFabricacao, String placa, String cor, int quantidadePortas, double precoBase) {
        super(marca, modelo, placa, cor, anoFabricacao, precoBase);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String getTipo(){
        return "Carro";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Portas: %d", quantidadePortas);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
