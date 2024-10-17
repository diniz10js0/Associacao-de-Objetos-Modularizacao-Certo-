public class Professor {
    private String nome;
    private int idade;

    // Construtor
    public Professor(String nomeProf, int idadeProf) {
        nome = nomeProf;
        idade = idadeProf;
    }

    // Método get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // exibir informações do professor
    public String exibirDados() {
        return "Professor: " + nome + ", Idade: " + idade;
    }
}
