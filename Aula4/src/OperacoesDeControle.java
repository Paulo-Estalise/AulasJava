import java.util.Scanner;

public class OperacoesDeControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exemplo omde eu valide se um individuo é maior de idade
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        //Estruturas condicionais

        //Para ser maior de idade tem que >=18
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // else if multiplas conficoes
        // se o individo tiver ate 10 anos não paga ingresso, se for menor que 18 e maior que 10 paga meia entrada
        // e maiores de 18 paga inteira
        if (idade <=10){
            System.out.println("Não paga");
        } else if (idade >=18) {
            System.out.println("Paga meia");
        } else {
            System.out.println("Paga inteira");
        }

        if (idade <= 18) {
            System.out.println("Paga inteira");
        } else if (idade > 10) {
            System.out.println("Paga meia");
        } else {
            System.out.println("Não paga");
        }

        // dia 5 recebo meu salario, dia 10 pago a conta de luz, dia 15 pago a internet, outros dois
        //não tenho nada a pagar

        System.out.println("Insira o dia de hoje ( de 0 a 31): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 5:
                System.out.println("Recebe");
                break; //mandatorio para quebra o fluxo do switch
            case 10:
                System.out.println("Pagar a conta de luz");
               break;
            case 15:
                System.out.println("Pagar a internet");
                break;

        }





















    }
}
