package edu.kelly.bootcampdio.estruturascondicionais;

public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "N";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
            System.out.println("INDEFINIDO");
                break;
        }




    }
}