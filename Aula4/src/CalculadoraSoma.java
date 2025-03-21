import java.util.Scanner;

// Classe iniciada com letra minuscula perde ponto
// Construir uma calculadora que faça operações de soma
public class CalculadoraSoma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Imprimir uma mensagem solicitado o primeiro número
        System.out.println("Insira o primeiro número:");
        //Receber o primeiro número
        float num1 = scanner.nextFloat();

        //Imprimir uma mensagem solicitando o segundo número
        System.out.println("Insira o segundo número:");
        //Segundo numero
        float num2 = scanner.nextFloat();

        //Fazer a operação de soma
        float resultado = num1 + num2;

        //Mostrar o resultado
        System.out.println("O resultado da soma "+num1 +" com "+ num2 + " é "+ resultado);

        scanner.close();
    }

}