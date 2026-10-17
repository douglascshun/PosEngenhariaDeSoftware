import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Digite um número para saber se ele é um número primo: ");
        n = entrada.nextInt();
        int cont = 0;
        for (int i = 1; i < (n + 1); i++)
            if (n % i == 0)
                cont = cont + 1;
        System.out.println(cont == 2);
        entrada.close();
    }
}
