package edu.kelly.bootcampdio.metodos;

/* Classe usuário agindo sobre o objeto smart tv */
public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        System.out.println(" *********MUDANÇA*********");

        smartTv.mudarEstado();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanalMais();
        smartTv.mudarCanalMais();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        System.out.println(" *********MUDANÇA*********");

        smartTv.mudarCanalNumero(20);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        System.out.println(" *********MUDANÇA*********");

        smartTv.mudarCanalMenos();
        smartTv.mudarCanalMenos();
        smartTv.mudarCanalMenos();
        smartTv.mudarEstado();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

    }


}
