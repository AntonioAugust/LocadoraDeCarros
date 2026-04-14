package locadoraDeCarros;

import java.util.Date;

public class Venda {
    private int idVenda;
    private Date data;
    private Veiculo veiculo;
    private Cliente cliente;
    private Double valorFinal;
    private String formaPagamento;

    public Venda(Veiculo veiculo, Cliente cliente, Double valorFinal, String formaPagamento, Date data, int idVenda){
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


    @Override  //sobrescreve o metodo toString() chamado na funcao de printar (system.out.print(toString()))
    public String toString(){
        return "Id_Venda = "+ idVenda +"\nVeiculo = "+veiculo+"\nCliente = "+cliente+"\nData = "+data+"\nValorFinal = "+valorFinal+"\nFormaPagamento = "+formaPagamento+"\n ";





    }



}
