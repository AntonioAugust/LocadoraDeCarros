package locadoraDeCarros;
import java.time.LocalDate;

public class Main {

    public static void main() {
        // Inicializa o gerenciador
        controleClientes gestor = new controleClientes();

        System.out.println("--- Cadastrando Clientes ---");

        // Adicionando alguns clientes de teste
        gestor.addCliente("Fulano de Tal", "123.456.789-00", "Rua A, 123",
                LocalDate.of(1995, 5, 20), 500.00);

        gestor.addCliente("Ciclana Souza", "987.654.321-11", "Av. Central, 50",
                LocalDate.of(1988, 11, 10), 1250.50);

        // 1. Ver um cliente específico (ID 1)
        System.out.println("\nVisualizando Cliente ID 1:");
        gestor.verCliente(1);

        // 2. Ver o outro cliente (ID 2)
        System.out.println("\nVisualizando Cliente ID 2:");
        gestor.verCliente(2);

        // 3. Removendo um cliente
        System.out.println("\n--- Removendo Cliente ID 1 ---");
        gestor.removerCliente(1);

        // 4. Tentando ver o cliente removido para testar
        System.out.println("\nTentando visualizar ID 1 após remoção:");
        gestor.verCliente(1);
    }
}