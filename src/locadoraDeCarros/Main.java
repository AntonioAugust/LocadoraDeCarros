package locadoraDeCarros;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(123456789, "João", "Rua A", 150000);

        System.out.println("======================================");
        System.out.println("         TESTE DA CARTEIRA");
        System.out.println("======================================");

        System.out.println("Dinheiro inicial do cliente: " + cliente1.getCarteira().getDinheiro());

        cliente1.getCarteira().Depositar(100);
        cliente1.getCarteira().Remover(50);

        System.out.println("Dinheiro após operações: " + cliente1.getCarteira().getDinheiro());
        System.out.println();

        System.out.println("======================================");
        System.out.println("          TESTE DE HERANCA");
        System.out.println("======================================");

        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "ABC-1234", 100000, "Prata", 4);
        Moto moto1 = new Moto("Honda", "CG 160", 2023, "XYZ-5678", 20000, "Preta", 160);

        System.out.println("---------- DADOS DO CARRO ----------");
        System.out.println(carro1.exibirDados());
        System.out.println();

        System.out.println("---------- DADOS DA MOTO -----------");
        System.out.println(moto1.exibirDados());
        System.out.println();

        System.out.println("======================================");
        System.out.println("        TESTE DE POLIMORFISMO");
        System.out.println("======================================");

        Veiculo veiculo1 = new Carro("Hyundai", "HB20", 2021, "DEF-4321", 80000, "Branco", 4);
        Veiculo veiculo2 = new Moto("Yamaha", "Fazer 250", 2022, "GHI-8765", 25000, "Azul", 250);

        System.out.println("Veiculo 1 - valor final: R$ " + veiculo1.calcularValorFinal());
        System.out.println("Veiculo 2 - valor final: R$ " + veiculo2.calcularValorFinal());
        System.out.println();

        System.out.println("======================================");
        System.out.println("   TESTE DA INTERFACE COMERCIALIZAVEL");
        System.out.println("======================================");

        Comercializavel item = new Carro("Chevrolet", "Onix", 2020, "JKL-1111", 70000, "Preto", 4);

        System.out.println("Valor final para venda: R$ " + item.calcularValorFinal());
        item.vender(cliente1);
        System.out.println("Dinheiro do cliente após compra: " + cliente1.getCarteira().getDinheiro());
        System.out.println();

        System.out.println("======================================");
        System.out.println("           TESTE DE VENDA");
        System.out.println("======================================");

        System.out.println("Dinheiro antes da compra: " + cliente1.getCarteira().getDinheiro());
        System.out.println();

        System.out.println("---------- ANTES DA VENDA ----------");
        System.out.println(carro1.exibirDados());
        System.out.println();

        carro1.vender(cliente1);
        System.out.println();

        System.out.println("Dinheiro depois da compra: " + cliente1.getCarteira().getDinheiro());
        System.out.println();

        System.out.println("---------- DEPOIS DA VENDA ---------");
        System.out.println(carro1.exibirDados());
    }
}