package locadoraDeCarros;
import java.time.LocalDate;

public class Main {

    public static void main() {
        // 1. Inicializa os Gerenciadores
        ControleClientes gestorClientes = new ControleClientes();
        ControleEstoque gestorEstoque = new ControleEstoque();
        // O ControleVendas precisa conhecer o estoque para validar os veículos
        ControleVendas gestorVendas = new ControleVendas(gestorEstoque);

        // --- CADASTRO DE CLIENTES ---
        System.out.println("--- Cadastrando Clientes ---");
        gestorClientes.addCliente("Fulano de Tal", "123.456.789-00", "Rua A, 123",
                LocalDate.of(1995, 5, 20), 500000.00); // Dei mais saldo para ele conseguir comprar

        gestorClientes.addCliente("Ciclana Souza", "987.654.321-11", "Av. Central, 50",
                LocalDate.of(1988, 11, 10), 150000.00);

        // --- CADASTRO DE VEÍCULOS NO ESTOQUE ---
        System.out.println("\n--- Cadastrando Veículos no Estoque ---");

        Carro c1 = new Carro("Toyota", "Corolla", LocalDate.of(2023, 1, 1), "ABC-1234", "Prata", 4 , 160000.00);
        Moto m1 = new Moto("Honda", "CB 500", LocalDate.of(2024, 2, 1) ,"XYZ-5678", 35000.00, "Vermelho", 500);

        gestorEstoque.addVeiculo(c1); // Receberá ID 1
        gestorEstoque.addVeiculo(m1); // Receberá ID 2

        // --- REALIZANDO VENDAS ---
        System.out.println("\n--- Iniciando Transações ---");

        // Precisamos pegar os objetos Clientes para passar para a venda
        // Supondo que o ID 1 é o Fulano e o ID 2 é a Ciclana
        Cliente fulano = gestorClientes.getCliente(1);
        Cliente ciclana = gestorClientes.getCliente(2);

        // Tentativa de Venda 1: Fulano compra o Corolla (ID 1)
        if (fulano != null) {
            gestorVendas.adicionarVenda(fulano, c1, "Cartão de Crédito");
        }

        // Tentativa de Venda 2: Ciclana compra a Moto (ID 2)
        if (ciclana != null) {
            gestorVendas.adicionarVenda(ciclana, m1, "PIX");
        }

        // --- VERIFICAÇÃO FINAL ---
        System.out.println("\n--- Histórico de Vendas Realizadas ---");
        gestorVendas.verVenda(1);
        gestorVendas.verVenda(2);

        System.out.println("\n--- Saldo Atual dos Clientes ---");
        System.out.println(fulano.getNomeCompleto() + " saldo: R$ " + fulano.getCarteira().getDinheiro());
        System.out.println(ciclana.getNomeCompleto() + " saldo: R$ " + ciclana.getCarteira().getDinheiro());


    }
}