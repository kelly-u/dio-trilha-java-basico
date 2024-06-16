package edu.kelly.bootcampdio.estruturascondicionais;

public class ResultadoEscolar3 {
    public static void main(String[] args) {
        int nota = 5;

        // Condicional ternária - é mais sismples
        String resultado = nota>=7 ? "Aprovado" : "Reprovado";

        System.out.println("Resultado 1:" + resultado);

        // Condicional encadeada - tem vários caminhos caminhos
        resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";

        System.out.println("Resultado 2: " + resultado);
    }
}
