package locadoraDeCarros;

import java.time.LocalDate;

public class Venda {
    private int idVenda;
    private LocalDate data;
    private final Double valorFinal;
    private String formaPagamento;

    // Snapshots (Strings que não mudam mais)
    private String snapshotVeiculo;
    private String snapshotCliente;

    public Venda(int idVenda, Cliente cliente, Veiculo veiculo, String formaPagamento) {
        this.idVenda = idVenda;
        this.formaPagamento = formaPagamento;
        this.data = LocalDate.now();

        this.valorFinal = veiculo.getPreco();

        this.snapshotVeiculo = veiculo.toString();

        this.snapshotCliente = String.format("ID: %d | Nome: %s | CPF: %s",
                cliente.getIdCliente(),
                cliente.getNomeCompleto(),
                cliente.getCpf());
    }

    @Override
    public String toString() {
        return "--- RECIBO DE VENDA #" + idVenda + " ---" +
                "\nData: " + data +
                "\nCliente: " + snapshotCliente +
                "\nVeículo: " + snapshotVeiculo +
                "\nValor Pago: R$ " + String.format("%.2f", valorFinal) +
                "\nForma de Pagamento: " + formaPagamento +
                "\n----------------------------";
    }

    public int getIdVenda() {
        return idVenda;
    }

    public LocalDate getDate() {
        return data;
    }

}
