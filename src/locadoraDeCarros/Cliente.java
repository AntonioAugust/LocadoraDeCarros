package locadoraDeCarros;

/**
 * Classe que representa um cliente do sistema.
 * Ela armazena os dados pessoais do cliente e a sua carteira.
 */
public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private Carteira carteira; // 👈 nova associação

    /**
     * Associa uma carteira ao cliente.
     *
     * @param carteira carteira do cliente
     */
    public void setCarteira(Carteira carteira){
        this.carteira = carteira;
    }

    /**
     * Retorna a carteira do cliente.
     *
     * @return carteira do cliente
     */
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

    /**
     * Construtor da classe Cliente.
     *
     * @param cpf cpf do cliente
     * @param nome nome do cliente
     * @param endereco endereco do cliente
     * @param carteira carteira do cliente
     * @param dinheiroInicial saldo inicial da carteira
     */
    public Cliente(int cpf, String nome, String endereco, Carteira carteira, double dinheiroInicial){
        setCpf(cpf);
        setNome(nome);
        setEndereco(endereco);
        setCarteira(carteira);
        carteira.Depositar(dinheiroInicial);
    }

    /**
     * Mostra as informacoes do cliente.
     */
    public void mostarInfoCliente(){
        System.out.println("------ INFORMAÇÕES DO CLIENTE ------\nNome: " + getNome() + "\nEndereço: " + getEndereco() + "\nCPF: " + getCpf() +"\nSaldo atual: " + carteira.getDinheiro());
    }
}
