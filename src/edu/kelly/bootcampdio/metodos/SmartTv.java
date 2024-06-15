package edu.kelly.bootcampdio.metodos;

/* Objeto */
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void mudarEstado(){
        ligada = !ligada;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void mudarCanalMais(){
        canal ++;
    }

    public void mudarCanalMenos(){
        canal --;
    }

    public void mudarCanalNumero(int valorCanal){
        canal = valorCanal;
    }

}
