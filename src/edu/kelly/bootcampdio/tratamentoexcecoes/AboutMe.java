package edu.kelly.bootcampdio.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
public static void main(String[] args) {
    
    /*Erros != excessões
     * Erros fazem o progrrama parar. São insustentáveis para o java.
     * Excessões são fluxos diferentes do que aqueles esperados
     * Por exemplo: Não ser informado um nome, idade com valor não numérico, etc...
     */


     /* Quando perceber que pode ter um erro,
      * try = bloco de tentativas. Se ele apresentar ou disparar alguma exceção...
      * (DISPARA O ERRO)
      *
      * catch = bloco a ser executado  caso ocorra um erro no bloco try.
      * (CAPTURA O ERRO)
      * 
      * finally = bloco de código a ser executado independente de ocorrer um erro ou não
      *
      * try  e catch vem em pares e finally é opicional
      */

    try {
    // try fica observando tudo o que for positivo. Se der tudo certo, ok e ele não dispara nada. Se não, o catch lá em baixo entra em ação para capturar o que foi disparado pelo try.
    //Por isso que se fala que o try lança uma excessão e o catch pega

    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    // Imprimindo dados obtidos pelo usuário
    System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
    System.out.println("Tenho " + idade +" anos");
    System.out.println("Minha altura é " + altura + "cm");
    scanner.close();
    }
    // e = var
    // Não esquece de IMPORTAR a classe da excessão!!!
    catch(InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos!");
        // Também pode ser:
        System.err.println("Os campos idade e altura precisam ser numéricos!");
    }
}

}
