package locadoraDeCarros;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControleVendas {
    private int numeroTotalVendas=0;
    private List<Venda> listaVendas = new ArrayList<>();

    /*public ControleVendas(){
    }
    */
    public void adicionarVenda(Veiculo veiculo, Cliente cliente, Double valorFinal, String formaPagamento, Date data){
        numeroTotalVendas++;
        listaVendas.add(new Venda(veiculo, cliente, valorFinal, formaPagamento, data, numeroTotalVendas));

    }

    public void removerVenda(int idVenda) {
        for (Venda v : listaVendas) {
            if (listaVendas.isEmpty()) return;
            if (v.getIdVenda() == idVenda) {
                System.out.println(v);
                return;
            }
        }
    }

    public void verVenda(int idVenda){
        for(Venda v : listaVendas){
            if(v.getIdVenda() == idVenda){
                System.out.println(v);
                return;
            }
        }
    }


}
