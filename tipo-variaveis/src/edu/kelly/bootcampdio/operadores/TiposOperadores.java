package edu.kelly.bootcampdio.operadores;

public class TiposOperadores {
    public static void main(String[] args) {
        //Operadores de atribuição
        /*Representados pelo símbolo de igualdade (=).
        Definem um valor inicial ou sobrescrevem o valor de uma variável.*/

        String nome = "Kelly";
        int idade = 26;

        //Operadores aritméticos
        /*Representados pelo símbolos + (adição ou concatenação de strings), - (subtração), * (multiplicação), / (divisão).
        Utilizados para operações aritméticas.*/

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        String concatenacao = 1 + 1 + "1"; //21
        concatenacao = "1" + 1 + 1; //111
        //-> depois que ele le um texto, trata todo o resto como texto, e não amis como número.
        concatenacao = "1" + (1 + 1 + 1); //13
        // -> como os números 1 estavam em evidência, forma tratados como números, mesmo depois de uma string.

        //Operadores unários
        /*Representados pelo símbolos + (valor positivo), - (negativo), ++ (incrementar), -- (decrementar), ! (negação).
        Utilizados em conjunto com outro operador aritmético.*/

        int numero = 5; // 5
        numero =- numero; // -5
        numero = numero * (-1);

        System.out.println(numero++); // 5
        // Mostrou o número e depois incrementou.

        System.out.println(numero); // 6

        System.out.println(++ numero); // 7
        // Incrementou e depois acrescentou o número
    
        /* o mesmo vale para DECREMENTO */


        // Negar valores booleanos:
        boolean casada = false;
        System.out.println(!casada); // true

        // Para negar ela em memória.
        casada =! casada;
        System.out.println(casada); // true  
        
        

        //Operadores ternários
        /*Representados pelo símbolos + (valor positivo), - (negativo), ++ (incrementar), -- (decrementar), ! (negação).
        Utilizados em conjunto com outro operador aritmético.*/
    }
}
