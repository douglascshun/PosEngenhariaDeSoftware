import java.util.Scanner;

class EntradaSaida {
    public static void main (String[]args) {
        System.out.println("Olá, Mundo!");

        System.out.println("informe seu nome");

        String palavra;
        try (Scanner entrada = new Scanner(System.in)) {
            palavra = entrada.next();
        }
        System.out.println("nome digitado: " + palavra);
        }
}