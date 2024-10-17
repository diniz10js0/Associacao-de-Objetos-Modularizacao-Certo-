public class Usuario {
    public static void main(String[] args) {
        // Instanciar um condicionador de ar
        CondicionadorDeAr arCondicionado = new CondicionadorDeAr();

        // Tentativa de aumentar a temperatura enquanto está desligado
        arCondicionado.aumentarTemperatura();

        // Ligar o condicionador de ar
        arCondicionado.ligar();

        // Tentar aumentar a temperatura acima de 28 graus
        for (int i = 0; i < 10; i++) {
            arCondicionado.aumentarTemperatura();
        }

        // Tentar reduzir a temperatura abaixo de 15 graus
        for (int i = 0; i < 10; i++) {
            arCondicionado.reduzirTemperatura();
        }

        // Aumentar a temperatura para 25 graus
        for (int i = 0; i < 5; i++) {
            arCondicionado.aumentarTemperatura();
        }

        // Imprimir a temperatura atual
        arCondicionado.imprimirTemperatura();
    }
}
