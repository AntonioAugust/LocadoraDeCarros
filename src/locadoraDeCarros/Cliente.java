package locadoraDeCarros;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private Carteira carteira; // 👈 nova associação

    public Cliente(int cpf, String nome, String endereco, double dinheiroInicial){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.carteira = new Carteira();
        this.carteira.Depositar(dinheiroInicial);
    }

    public Carteira getCarteira(){
        return carteira;
    }


    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
