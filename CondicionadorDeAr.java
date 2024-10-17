public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    // Construtor
    public CondicionadorDeAr() {
        termostato = new Termostato();
        ligado = false; // Inicialmente desligado
    }

    // Método de acesso para saber se está ligado
    public boolean isLigado() {
        return ligado;
    }

    // Método de acesso ao termostato
    public Termostato getTermostato() {
        return termostato;
    }

    // Método para ligar o condicionador
    public void ligar() {
        ligado = true;
        System.out.println("Condicionador de ar ligado.");
    }

    // Método para desligar o condicionador
    public void desligar() {
        ligado = false;
        System.out.println("Condicionador de ar desligado.");
    }

    // Método para aumentar a temperatura
    public void aumentarTemperatura() {
        if (ligado) {
            int temperaturaAtual = termostato.getTemperatura();
            if (temperaturaAtual < 28) {
                termostato.setTemperatura(temperaturaAtual + 1);
                System.out.println("Temperatura aumentada para: " + termostato.getTemperatura() + " graus.");
            } else {
                System.out.println("Erro: Temperatura ja esta no maximo permitido (28 graus).");
            }
        } else {
            System.out.println("Erro: O condicionador de ar esta desligado.");
        }
    }

    // Método para reduzir a temperatura
    public void reduzirTemperatura() {
        if (ligado) {
            int temperaturaAtual = termostato.getTemperatura();
            if (temperaturaAtual > 15) {
                termostato.setTemperatura(temperaturaAtual - 1);
                System.out.println("Temperatura reduzida para: " + termostato.getTemperatura() + " graus.");
            } else {
                System.out.println("Erro: Temperatura ja esta no manimo permitido (15 graus).");
            }
        } else {
            System.out.println("Erro: O condicionador de ar esta desligado.");
        }
    }

    // Método para imprimir a temperatura atual
    public void imprimirTemperatura() {
        if (ligado) {
            System.out.println("Temperatura atual: " + termostato.getTemperatura() + " graus.");
        } else {
            System.out.println("Erro: O condicionador de ar esta desligado.");
        }
    }
}
