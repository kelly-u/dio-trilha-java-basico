package edu.kelly.bootcampdio.metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public boolean mudarEstado(){
        ligada = !ligada;
        return ligada;
    }

    public int aumentarVolume(){
        volume ++;
        return volume;
    }

    public int diminuirVolume(){
        volume --;
        return volume;
    }

    public int mudarCanalMais(){
        canal ++;
        return canal;
    }

    public int mudarCanalMenos(){
        canal --;
        return canal;
    }

    public int mudarCanalNumero(int valorCanal){
        canal = valorCanal;
        return canal;
    }

}
