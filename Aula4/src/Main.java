import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu primeiro nome:");
        String primeironome = scanner.next();
        System.out.println("Seja bem-vindo " + primeironome);

        System.out.println("Insira sua idade:");
        int idade = scanner.nextInt();
        System.out.println( " Olá " + primeironome + " Sua idade é " + idade);
        //Na prova sempre chamar close() ao finalizar o programa
        scanner.close();




    }

}
