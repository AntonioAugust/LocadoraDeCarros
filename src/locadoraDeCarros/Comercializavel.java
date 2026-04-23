package locadoraDeCarros;

/**
 * Interface usada para indicar que um objeto pode ser vendido no sistema.
 * No nosso caso, todo veículo pode ser comercializdo. Por isso, a classe
 * Veiculo implementa essa interface e obriga as classes filhas a terem um
 * cálculo de valor final.
 */

public interface Comercializavel{
    /**
     * Calcula o valor final de venda.
     * Cada tipo de veículo pode calcular esse valor do seu próprio jeito.
     * @return
     */

    double calcularValorFinal();

    /**
     * Realiza a venda do veículo
     */
    public void vender(Cliente cliente);



}
