public class Atribuicao {
    private Professor professor;
    private Disciplina disciplina;

    // Construtor
    public Atribuicao(Professor prof, Disciplina disc) {
        professor = prof;
        disciplina = disc;
    }

    // Método para exibir informações da atribuição
    public String exibirDados() {
        return professor.exibirDados() + "\n" + disciplina.exibirDados();
    }
}
