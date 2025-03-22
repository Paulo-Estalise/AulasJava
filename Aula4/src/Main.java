import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caminhao meu = new Caminhao()
        Scanner scanner = new Scanner(System.in)
        //Receber a velocidade atual
        System.out.println("Qual a velocdade atual");
        meu.velocidade = scanner.nextInt();

        //Velocidade final desejada
        System.out.println("Qual a velocidade final desejada?");
        int velcidadeFinalEsperada = scanner.nextInt();

        do {
            if (meu.velocidade < velcidadeFinalEsperada){
                meu.acelerar();
            } else {
                meu.frear();
            }
        } while (meu.velocidade != velcidadeFinalEsperada);

        //Imprimir o resultado
        System.out.println("A velocidade atual"+meu.velocidade) "atingiu a velocidade " +
            "esperada de" + velocidadeFinalEsperada;



        scanner.close();
    }
}
