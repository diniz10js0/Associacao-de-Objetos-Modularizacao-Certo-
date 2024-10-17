public class Termostato {
    private int temperatura;

    // Construtor
    public Termostato() {
        temperatura = 20; // Temperatura inicial padrão
    }

    // Método de acesso
    public int getTemperatura() {
        return temperatura;
    }

    // Método modificador com validação de limites
    public void setTemperatura(int novaTemperatura) {
        if (novaTemperatura >= 15 && novaTemperatura <= 28) {
            temperatura = novaTemperatura;
        } else {
            System.out.println("Erro: Temperatura fora dos limites permitidos (15-28 graus).");
        }
    }
}
