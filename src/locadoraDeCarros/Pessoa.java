package locadoraDeCarros;
import java.time.LocalDate;

abstract class Pessoa {
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private LocalDate nascimentoData;

    public Pessoa(String nomeCompleto, String cpf, String endereco, LocalDate nascimentoData){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimentoData = nascimentoData;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getNascimentoData() {
        return nascimentoData;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNascimentoData(LocalDate nascimentoData) {
        this.nascimentoData = nascimentoData;
    }
}
