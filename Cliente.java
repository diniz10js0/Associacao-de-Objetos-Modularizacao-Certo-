public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;

    // Construtor
    public Cliente(String nomeCliente, String cpfCliente, ContaCorrente contaCliente) {
        nome = nomeCliente;
        cpf = cpfCliente;
        conta = contaCliente;
    }

    // Métodos de acesso e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nomeCliente) {
        nome = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpfCliente) {
        cpf = cpfCliente;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente contaCliente) {
        conta = contaCliente;
    }

    // Método para exibir os dados do cliente
    public String exibirDados() {
        return "Nome: " + nome + "\nCPF: " + cpf;
    }
}
