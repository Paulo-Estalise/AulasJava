public class Caminhao {

    //atributos
    int velocidade;

    CorDeCarro cor;

    Integer ano;

    String modelo;


    //métodos

    void acelerar(){
        velocidade++; //equivalente velocidade = velocidade + 1

    }
    void frear(){
        if(velocidade!= 0) {
            velocidade--; //equivalente velocidade = velocidade - 1
        }
    }
}
