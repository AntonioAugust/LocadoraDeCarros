package locadoraDeCarros;

/**
 * Interface usada para indicar que um objeto pode ser vendido no sistema.
 * No nosso caso, os veiculos podem ser comercializados.
 */
public interface Comercializavel{

    /**
     * Calcula o valor final de venda.
     * Cada tipo de veiculo pode calcular esse valor do seu proprio jeito.
     *
     * @return valor final de venda
     */
    double calcularValorFinal();


}
