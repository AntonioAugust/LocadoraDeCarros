package locadoraDeCarros;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private Carteira carteira; // 👈 nova associação

    public void setCarteira(Carteira carteira){
        this.carteira = carteira;
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

    public Cliente(int cpf, String nome, String endereco, Carteira carteira, double dinheiroInicial){
        setCpf(cpf);
        setNome(nome);
        setEndereco(endereco);
        setCarteira(carteira);
        carteira.Depositar(dinheiroInicial);
    }

    public void mostarInfoCliente(){
        System.out.println("------ INFORMAÇÕES DO CLIENTE ------\nNome: " + getNome() + "\nEndereço: " + getEndereco() + "\nCPF: " + getCpf() +"\nSaldo atual: " + carteira.getDinheiro());
    }
}
