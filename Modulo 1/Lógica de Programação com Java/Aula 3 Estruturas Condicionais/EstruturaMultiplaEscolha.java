import java.util.Scanner;

public class EstruturaMultiplaEscolha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção (0-10): ");
        System.out.println("");
        System.out.println("Digite 1 se você deseja cadastrar um aluno");
        System.out.println("Digite 2 se você deseja cadastrar notas");
        System.out.println("Digite 3 se você deseja listar alunos e notas");

        int numero =entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Vamos cadastrar um aluno");
                break;
            case 2:
                System.out.println("Vamos cadastrar cadastrar notas");
                break;
            case 3:
                System.out.println("Vamos listar alunos e notas");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}