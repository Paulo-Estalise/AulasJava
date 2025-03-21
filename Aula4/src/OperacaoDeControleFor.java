import java.util.Scanner;

public class OperacaoDeControleFor {
    public static void main(String[] args) {


        //Imprima todos os numeros interiros anteriores ao valor inputado pelo user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
        //Imprima todos os numeros interiros anteriores ao valor inputado pelo user ordem decrescente
        System.out.println("Em ordem decrescente ");
        for (int i = num-1; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
