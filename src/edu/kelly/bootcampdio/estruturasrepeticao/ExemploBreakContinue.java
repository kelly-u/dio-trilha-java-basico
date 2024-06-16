package edu.kelly.bootcampdio.estruturasrepeticao;

public class ExemploBreakContinue {
    //Break e COntinue -> não é tão comum usá-los em estruturas de repeticao, mas em alguns casos é necessário
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
            if(i == 3)
                break; // para o código completamente quando a condição é satisfeita. NEM A APARECE O 3.
            System.out.println(i);
        }

        System.out.println("*********************");

        for(int i = 1; i <= 5; i++){
            if(i == 3)
                continue; // para o código apenas naquela interação, desconsiderando a condiçao especificada. Neste caso, a condição de i == 3, é desconsiderada do fluxo.
            System.out.println(i);
        }      
    }
}
