import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args){
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Advinhe o numero que esotu pensando ");
        int numero = entrada.nextInt();

        if(numero == x){
            System.out.print("Parabens, você acertou. Eu pensei no numero " + x);
        }
        else{
            System.out.print("Você errooou. Pensei no " + x);
        }
    }
}