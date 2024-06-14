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
        /*Representados pelo símbolos ?:
        Utilizados para resumir uma condição e escolher entre duas opções. É como um IF, mas que está tudo numa única linha*/
        /*
            <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
         */

        int a = 6,
             b = 6;
        String result = "";
        int resul;

        /*if(a == b){
            result = "Verdadeiro";
        }
        else{
            result = "Falso";
        }*/

        // Preciso atribuir esse operadora uma variável. Caso contrário, não teria lógica, né? Fazer essa operação e ela ficar perdida na memória.
        result = a == b ? "Verdadeiro" : "Falso";
        
        // O retorno deve ser de acordo com o tipo da variável
        resul = a == b ? 1 : 0;

        System.out.println("result: " + result);
        System.out.println("resul: " + resul);

        //Operadores relacioanis
        /*Representados pelo símbolos == (igual), != (diferente), > (maior que), >= (maior ou igual), < (menor que), <= (menor ou igual).
        Retorna um valor booleano.
        Pode ser usado em números ou String */
        
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao;
        String nome1 = "Kelly";
        String nome2 = "Kelly";
        String nome3 = new String("Kelly");

        simNao = numero1 == numero2; // false

        simNao = numero1 != numero2; // true
        
        simNao = numero1 > numero2; // false
        
        simNao = numero1 >= numero2; // false
        
        simNao = numero1 < numero2; // true
        
        simNao = numero1 <= numero2; // true
    
        simNao = nome1 == nome2; // true

        // para comparação de objetos, usa o equals
        simNao = nome1.equals(nome3); // true



        //Operadores lógicos
        /*Representados pelo símbolos && (E) e || (OU).
        Tabela verdade.
        Retorna um valor booleano.
        */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras!");
        }
        else if (condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira!");
        }
        else {
            System.out.println("Nenhuma das condições são verdadeiras!");
        }

        // Posso misturar operadores relacionais com lógicos também! 
        if (condicao1 && (7 > 4)) {
            System.out.println("Tudo verdadeiro!!");
        }
    }
}
