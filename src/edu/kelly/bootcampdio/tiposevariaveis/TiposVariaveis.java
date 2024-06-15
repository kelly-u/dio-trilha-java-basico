package edu.kelly.bootcampdio.tiposevariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        System.out.println("Valor do salário mínimo: " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto;

        //Constantes:
        final double VALOR_DE_PI = 3.14; //Nome da variável sempre em caixa alta.

    }
}
