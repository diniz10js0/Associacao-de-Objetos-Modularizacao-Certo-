public class CaixaEletronico {
    public static void main(String[] args) {
        // Criar agência
        Agencia agencia = new Agencia("Agencia Central", 7890);

        // Criar conta corrente
        ContaCorrente conta = new ContaCorrente(1234, agencia, 150.00);

        // Criar cliente
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        // Realizar operações
        System.out.println(cliente.exibirDados());

        // Sacar 140.0 (sucesso)
        System.out.println("Saque de 140.0: " + conta.sacar(140.0));

        // Consultar saldo (resultado é 10.0)
        System.out.println("Saldo atual: " + conta.consultarSaldo());

        // Sacar 200.0 (falha)
        System.out.println("Saque de 200.0: " + conta.sacar(200.0));

        // Consultar saldo (resultado é 10.0)
        System.out.println("Saldo atual: " + conta.consultarSaldo());

        // Depositar 25.45 (sucesso)
        conta.depositar(25.45);

        // Imprimir saldo final
        conta.imprimirSaldo();
    }
}
