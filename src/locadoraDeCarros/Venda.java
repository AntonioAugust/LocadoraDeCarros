package locadoraDeCarros;

import java.time.LocalDate;
import java.util.Date;

public class Venda {
    private int idVenda;
    private LocalDate data;
    private Veiculo veiculo;
    private Cliente cliente;
    private Double valorFinal;
    private String formaPagamento;

    public Venda(Veiculo veiculo, Cliente cliente, Double valorFinal, String formaPagamento, LocalDate data, int idVenda){
        this.idVenda = idVenda;
        this.data = data;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.valorFinal = valorFinal;
        this.formaPagamento = formaPagamento;
    }

    public int getIdVenda(){
        return idVenda;
    }

    public LocalDate getDate(){
        return data;
    }


    @Override  //sobrescreve o metodo toString() chamado na funcao de printar (system.out.print(toString()))
    public String toString(){
        return "Id_Venda = "+ idVenda +"\nVeiculo = "+veiculo+"\nCliente = "+cliente+"\nData = "+data+"\nValorFinal = "+valorFinal+"\nFormaPagamento = "+formaPagamento+"\n ";





    }



}
