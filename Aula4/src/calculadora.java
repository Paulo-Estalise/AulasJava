import java.util.Scanner;
//Construir uma calculadora que so faz soma
class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Imprimir uma mensagem de solicitando o primeiro numero
        System.out.println("Digite o primeiro numero: ");
        //Receber o primeiro número
        float num1 = scanner.nextFloat();
        // Imprimir uma mensagem de solicitando o segundo numero
        System.out.println("Digite o segundo numero: ");
        //Receber o segundo número
        float num2 = scanner.nextFloat();
        //Fazer a opreção de soma
        float resultado = num1 + num2;
        //Mostrar o Resultado
        System.out.println("O resultado da soma " + num1 + " + " + num2 + " é " + resultado);



        scanner.close();
    }
}
