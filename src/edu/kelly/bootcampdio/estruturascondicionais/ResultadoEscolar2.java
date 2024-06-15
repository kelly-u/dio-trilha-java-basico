package edu.kelly.bootcampdio.estruturascondicionais;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota  = 10;

    // Condicional encadeada - tem vários caminhos caminhos
    if(nota >= 7){
        System.out.println("Aprovado");
    }
    else if (nota >= 5 && nota < 7){
        System.out.println("Prova de Recuperação");
    }

    else{
        System.out.println("Reprovado");
    }
    }
}
