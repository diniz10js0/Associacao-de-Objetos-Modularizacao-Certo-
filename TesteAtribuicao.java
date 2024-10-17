import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        // Coletar dados do professor
        String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor:"));
        Professor professor = new Professor(nomeProfessor, idadeProfessor);

        // Coletar dados da disciplina
        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina é prática? (true/false)"));
        Disciplina disciplina = new Disciplina(nomeDisciplina, pratica);

        // Criar a atribuição
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        // Exibir dados da atribuição
        JOptionPane.showMessageDialog(null, atribuicao.exibirDados());
    }
}
