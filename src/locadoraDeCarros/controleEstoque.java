package locadoraDeCarros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class controleEstoque {
    private List<Veiculo> controleEstoque;
    private int proximoId;

    public controleEstoque(){
        controleEstoque = new ArrayList<>();
        proximoId = 0;
    }

    public void addVeiculo(Veiculo veiculo){
        proximoId++;
        veiculo.setIdVeiculo(proximoId);
        controleEstoque.add(veiculo);
    }

    public Veiculo removerVeiculo(int idVeiculo) {
        for (Veiculo v : controleEstoque) {
            if (controleEstoque.isEmpty()) return null;
            if (v.getIdVeiculo() == idVeiculo) {
                //System.out.println(v);
                controleEstoque.remove(v);
                return v;
            }
        }
        return null;
    }


}
