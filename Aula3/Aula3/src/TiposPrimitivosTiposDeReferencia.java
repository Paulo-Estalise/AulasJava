import java.util.Date;

public class TiposPrimitivosTiposDeReferencia {

    public static void main(String[] args) {

//      Tipos primitivos
//      * Inteiros
        byte minByteValue = -128; //1 byte = 8 bits
        byte maxByteValue = 127;

        System.out.println("Byte Value vai de " + minByteValue + " até " + maxByteValue);

        short minShortValue = -32768; //16 bits
        short maxShortValue = 32767;

        System.out.println("Short Value vai de " + minShortValue + " até " + maxShortValue);

        int minIntValue = -2147483648; //32 bits
        int maxIntValue = 2147483647;

        System.out.println("Int Value vai de " + minIntValue + " até " + maxIntValue);

        long minLongValue = -9223372036854775808L; //64 bits
        long maxLongValue = 9223372036854775807L;

        System.out.println("Long Value vai de " + minLongValue + " até " + maxLongValue);

        // * Decimais
        float minFloatValue = -3.4028235E38f; //32 bits -observar o E da notação científica
        float maxFloatValue = 3.4028235E38f;

        System.out.println("Float Value vai de " + minFloatValue + " até " + maxFloatValue);

        double minDoubleValue = -1.7976931348623157E308; //64 bits
        double maxDoubleValue = 1.7976931348623157E308;

        System.out.println("Double Value vai de " + minDoubleValue + " até " + maxDoubleValue);

        //Tipo lógico
        boolean valorLogicoPositivo = true; // 8 bits
        boolean valorLogicoNegativo = false;

        System.out.println("Boolean Value pode ser " + valorLogicoNegativo + " ou " + valorLogicoPositivo);

        //Tipo caractere
        char minCharValue = 0; //16 bits

        // Tipos não primitivo ou tipos de referência
        // String
        String nome = "João";

        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Nome: " + nome.toLowerCase());

        // Números inteiros
        // Obdece as mesmos intervalos de números dos tipos primitivos equivalentes
        Integer idade = 18;
        System.out.println("Idade: " + idade);

        Long idadeLong = 18L;
        System.out.println("Idade: " + idadeLong);

        Double altura = 1.75;
        System.out.println("Altura: " + altura);

        Float alturaFloat = 1.75f;
        System.out.println("Altura: " + alturaFloat);

        Date dataDeHoje = new Date();
        System.out.println("Data de hoje: " + dataDeHoje);

    }
}