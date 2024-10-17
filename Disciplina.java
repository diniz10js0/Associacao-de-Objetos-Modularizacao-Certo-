public class Disciplina {
    private String nome;
    private boolean pratica;

    // Construtor
    public Disciplina(String nomeDisc, boolean praticaDisc) {
        nome = nomeDisc;
        pratica = praticaDisc;
    }

    // Método get
    public String getNome() {
        return nome;
    }

    public boolean isPratica() {
        return pratica;
    }

    // exibir informações da disciplina
    public String exibirDados() {
        return "Disciplina: " + nome + ", Prática: " + (pratica ? "Sim" : "Não");
    }
}
