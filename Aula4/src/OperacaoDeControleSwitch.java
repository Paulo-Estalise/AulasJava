import java.util.Scanner;

public class OperacaoDeControleSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // dia 5 recebo meu salario , dia 10 pago a conta de luz, dia 15 pago a internet, outros dias
        // nao tenho obrigação finaceira

        System.out.println("Insira o dia de hoje (de 0 a 31): ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 5:
                System.out.println("Recebo salário");
                break; //mandatório para quebra o fluxo do switch
            case 10:
                System.out.println("Pagar conta de luz");
                break;
            case 15:
                System.out.println("Pagar internet");
                break;
            default:
                System.out.println("Sem obrigações financeiras");
        }

        scanner.close();
    }
}