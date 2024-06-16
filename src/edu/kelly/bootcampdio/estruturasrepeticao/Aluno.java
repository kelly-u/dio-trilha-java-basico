package edu.kelly.bootcampdio.estruturasrepeticao;

public class Aluno {
    public static void main(String[] args) {
        
       // for em arrays -> repetição para percorrer arrays (começam em 0)
       String alunos[] = {"KELLY", "DAVI", "EDILSON", "GLEICE", "JUNIOR"};

       for(int i=0; i<alunos.length; i++){
            System.out.println("Aluno(a)" + (i+1) + ": " + alunos[i]);
       }

    }
}