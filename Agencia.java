public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    // Construtor
    public Agencia(String nomeAgencia, int numeroAgencia) {
        nome = nomeAgencia;
        numero = numeroAgencia;
        digito = calcularDigitoAgencia(numeroAgencia);
    }

    // Métodos de acesso e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nomeAgencia) {
        nome = nomeAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numeroAgencia) {
        numero = numeroAgencia;
        digito = calcularDigitoAgencia(numeroAgencia);
    }

    public int getDigito() {
        return digito;
    }

    // Validação de dígito da agência (módulo 11)
    public int calcularDigitoAgencia(int numeroAgencia) {
        int[] multiplicadores = {4, 6, 8, 2};
        int soma = 0;
        String numStr = String.format("%04d", numeroAgencia);

        for (int i = 0; i < 4; i++) {
            soma += Character.getNumericValue(numStr.charAt(i)) * multiplicadores[i];
        }

        int resto = soma % 11;
        return (resto == 10) ? 0 : resto;
    }

    // Método para exibir os dados da agência
    public String exibirDados() {
        return "Agencia: " + numero + "-" + digito + "\nNome: " + nome;
    }
}
