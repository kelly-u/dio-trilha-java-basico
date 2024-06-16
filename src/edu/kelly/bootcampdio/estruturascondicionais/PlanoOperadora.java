package edu.kelly.bootcampdio.estruturascondicionais;

public class PlanoOperadora {
    public static void main(String[] args) {
        // Switch Case - uma variável e muitos casos. E esses casos tem diferenças entre si.

        /* DAR UMA OLHADA EM:
         * - continue
         * - break
         * - default
         */

        String plano = "M"; // M / T

        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");  
            case "M":
                System.out.println("Whats e Instagram grátis"); 
            case "B":
                System.out.println("100 min de ligação");      
        }
        /*
         * Sem o break, assim que o case entra, ele segue e imprime os outros também.
         * Ou seja, se for caso B, só é impresso o caso B.
         * Se for o caso M, ele imprime o M e o B que está abaixo dele.
         * Se for o T, ele imprime o T, o M abaixo e o B abaixo também.
         * Então, foi feito a organização em que o maior pacote do plano de operadora fosse o primeiro. Porque caso ele fosse oselecionado, seria disponibilizado os outros pacotes descritos nos cases abaixo também ;)
         * Lógica, né?
         */
    }
}
