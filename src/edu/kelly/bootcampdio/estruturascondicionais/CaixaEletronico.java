package edu.kelly.bootcampdio.estruturascondicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
       double saldo = 25.0;
       double valorSolicitado = 17.0;

       // Condicional simples - só tem um caminho (o caminho feliz)
       if (valorSolicitado < saldo){
        saldo -= valorSolicitado;
       }

       System.out.println(saldo);
    }
}
