package autovendas;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoque {
    private List<itemEstoque> controleEstoque;
    private int proximoId;

    public ControleEstoque(){
        controleEstoque = new ArrayList<>();
        proximoId = 0;
    }

    public void addEstoque(Veiculo veiculo, double preco){
        proximoId++;
        controleEstoque.add(new itemEstoque(veiculo, preco, proximoId));
    }

    public itemEstoque removerEstoque(int itemId) {
        for (itemEstoque v : controleEstoque) {
            if (controleEstoque.isEmpty()) return null;
            if (v.getIdItem() == itemId) {
                //System.out.println(v);
                controleEstoque.remove(v);
                return v;
            }
        }
        return null;
    }

    public itemEstoque buscarPorId(int id){

        for(itemEstoque item : controleEstoque){
            if(item.getIdItem() == id){
                return item;
            }
        }
        return null;
    }


}
