import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um valor ou 99 para sair: ");
            opcao = scanner.nextInt();
        } while (opcao != 99);

        scanner.close();
    }
}
