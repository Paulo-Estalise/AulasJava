public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // Operadores aritméticos em Java
        // Soma, subtração, multiplicação, divisão e módulo

        int anoDeNascimento = 1989;
        int anoAtual = 2025;

        // subtração vamos usar o simbolo -
        int idade = anoAtual - anoDeNascimento;

        System.out.println("Eu tenho "+ idade + " anos.");

        // adição vamos usar o símbolo +
        int anosParaAdicionar = 10;
        int idadeFuturo = idade + anosParaAdicionar;

        System.out.println("Daqui a "+anosParaAdicionar+ " anos terei " + idadeFuturo + " anos.");

        // multiplicação vamos usar o símbolo *

        // Valor total para comprar 30 balas a R$ 1,00 cada
        double valor = 1;
        double quantidadeDeAlunos = 30;

        double valorTotal =  valor * quantidadeDeAlunos;

        System.out.println("Valor total sem desconto = R$"+valorTotal);

        // recebi um desconto de R$1,50

        double desconto = 1.5;
        valorTotal = valorTotal - desconto;

        System.out.println("Valor total = R$"+valorTotal);

        // divisão vamos usar o símbolo /
        //Pagar o valor total em 10 parcelas
        double parcela = valorTotal / 10;

        System.out.println("Valor da parcela = R$"+ parcela);

        // modulo - vamos usar o símbolo %
        // determine o resto da divisão de 7 por 2


        System.out.println("Resto da divisão de 5 por 2 é "+ 5%2);
        System.out.println("Resto da divisão de 6 por 2 é "+ 6%2);
        System.out.println("Resto da divisão de 7 por 2 é "+ 7%2);
        System.out.println("Resto da divisão de 8 por 2 é "+ 8%2);
        System.out.println("Resto da divisão de 9 por 2 é "+ 9%2);
        System.out.println("Resto da divisão de 31 por 2 é "+ 31%2);
        System.out.println("Resto da divisão de 45 por 2 é "+ 45%2);
        System.out.println("Resto da divisão de 66 por 2 é "+ 66%2);
        // quando for par o resto da divisão é 0
    }
}