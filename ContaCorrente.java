public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    // Construtor
    public ContaCorrente(int numeroConta, Agencia agenciaConta, double saldoInicial) {
        numero = numeroConta;
        agencia = agenciaConta;
        saldo = saldoInicial;
        digito = calcularDigitoConta(numeroConta);
    }

    // Métodos de acesso e modificadores
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numeroConta) {
        numero = numeroConta;
        digito = calcularDigitoConta(numeroConta);
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agenciaConta) {
        agencia = agenciaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar
    public double sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saque não efetuado. Saldo insuficiente.");
            return 0;
        }
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para imprimir o saldo e os dados da conta
    public void imprimirSaldo() {
        System.out.println("Conta Corrente: " + numero + "-" + digito);
        System.out.println(agencia.exibirDados());
        System.out.println("Saldo: " + saldo);
    }

    // Validação de dígito da conta (módulo 11)
    public int calcularDigitoConta(int numeroConta) {
        int[] multiplicadores = {4, 6, 8, 2};
        int soma = 0;
        String numStr = String.format("%04d", numeroConta);

        for (int i = 0; i < 4; i++) {
            soma += Character.getNumericValue(numStr.charAt(i)) * multiplicadores[i];
        }

        int resto = soma % 11;
        return (resto == 10) ? 0 : resto;
    }
}
