package edu.kelly.bootcampdio.estruturasrepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class Doceria {

    public static void main(String[] args) {
        
        double mesada = 50.0;

        // A variável mesadaprecisa sertratada para que em algum momento seja 0, caso contrário, o while seria infinito.
        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada; // só pra facilitar a vida e ão precisar ficar fazendo novas verificações - visto que é apenas um exemplo ipotético.
            
            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Davi gastou toda a sua mesada em doces...!");
    }

        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,8);
            // retorna um valor entre 2 e 8
        }
}
