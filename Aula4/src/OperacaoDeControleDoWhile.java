
//imprimr todas as idades que são menores que 18
public class OperacaoDeControleDoWhile {

    public static void main(String[] args) {

        //ponto de inicio
        int idade = 17;


        //ponto parada
        do {
            System.out.println("Idade = " +idade);
            idade--;
        } while (idade >= 0);
    }
}
