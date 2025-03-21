public class OperadoresLogicos {

    public static void main(String[] args) {
        //Operadores Lógicos

        boolean souAdulto = true;
        boolean jaTenhoNivelSuperior = false;

        // AND ou E (&&)
        boolean resultadoComAnd = souAdulto && jaTenhoNivelSuperior;
        System.out.println("souAdulto e jaTenhoNivelSuperior = " + resultadoComAnd);

        // OR ou ou (||)
        boolean resultadoComOr = souAdulto || jaTenhoNivelSuperior;
        System.out.println("souAdulto ou jaTenhoNivelSuperior = " + resultadoComOr);

        //Operador de negação (!)
        System.out.println("não(souAdulto ou jaTenhoNivelSuperior = " + resultadoComOr+ ") = "+ !resultadoComOr);
    }
}