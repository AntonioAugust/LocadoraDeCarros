package locadoraDeCarros;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ControleVendas {
    private int proximoId;
    private List<Venda> listaVendas;
    private ControleEstoque estoque;

    public ControleVendas(ControleEstoque estoque){
        listaVendas = new ArrayList<>();
        this.estoque = estoque;
        proximoId = 1;
    }

    public void adicionarVenda(Cliente cliente, Veiculo veiculo, String formaPagamento){

        Veiculo veiculoRemov = estoque.removerVeiculo(veiculo.getIdVeiculo());
        if (veiculoRemov == null) {
            System.out.println("ERRO: Veículo com ID " + veiculo.getIdVeiculo() + " não encontrado no estoque!");
            return;
        }

        double valorVenda = veiculo.getPreco();

        if(cliente.getCarteira().getDinheiro() < valorVenda){
            System.out.println("ERRO: Saldo insuficiente! Saldo: " + cliente.getCarteira().getDinheiro() + " | Necessário: " + valorVenda);

            //Se não tem dinheiro devolvemos o carro para o estoque
            estoque.addVeiculo(veiculoRemov);
            return;
        }

        cliente.getCarteira().Remover(valorVenda);

        Venda novaVenda = new Venda(proximoId++, cliente, veiculo, formaPagamento);
        listaVendas.add(novaVenda);

    }


    public void verVenda(int idVenda){
        for(Venda v : listaVendas){
            if(v.getIdVenda() == idVenda){
                System.out.println(v);
                return;
            }
        }
    }
    //sobrecarga de funcao
    public void verVenda(LocalDate date){
        for(Venda v : listaVendas){
            if(date.isEqual(v.getDate())){
                System.out.println(v);

            }
        }
    }
}
