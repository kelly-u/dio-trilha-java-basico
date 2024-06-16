package edu.kelly.bootcampdio.estruturasrepeticao;

public class Aluno {
    public static void main(String[] args) {
        
       // for em arrays -> repetição para percorrer arrays (começam em 0)
       String alunos[] = {"KELLY", "DAVI", "EDILSON", "GLEICE", "JUNIOR"};

       for(int i=0; i<alunos.length; i++){
            System.out.println("Aluno(a)" + (i+1) + ": " + alunos[i]);
       }

       // for each -> muito usado em arrays. Mais simplificado do que o for
       for(String aluno : alunos){
           System.out.println("Nome do aluno é: " + aluno);
       }
       // aluno é a variável que vai ter seu valor alternado para os itens do array.
    }
}