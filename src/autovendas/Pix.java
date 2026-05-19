package autovendas;

public class Pix extends FormaPagamento{
    private double desconto = 0.95;

    public Pix(){
        setNome("Pix");
    }

    @Override
    public double aplicarTaxa(double valor){
        return valor * this.desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

}
