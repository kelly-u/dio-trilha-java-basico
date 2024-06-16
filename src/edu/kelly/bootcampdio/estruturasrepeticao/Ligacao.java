package edu.kelly.bootcampdio.estruturasrepeticao;

import java.util.Random;

public class Ligacao {

    // do while - > precisa que a instrução ocorra pelo menos uma vez antes de verificar se ela está de acordo com a condição de execução.
    public static void main(String[] args) {
        do {
            System.out.println("Telefone tocando..."); // Precisa tocar pelo menos uam vez para que alguém possa atender. Por isso, está dentro do DO.
        }
        while(ligando());

        System.out.println("Alô!");
    }
    
    private static boolean ligando(){
        boolean atendeu = new Random().nextInt(3) == 1; // Random vai prover um valor aleatório entre 1 e 3. E se esse valor for igual (==) a 1, quer dizer que ele atendeu.
        System.out.println("Atendeu? " + atendeu);
        
        return ! atendeu; // Negando o ato de continuar ligando / tocando
        // Se ele atendeu, não quero que ele diga que está tocando. Só entra no random até o boolean atendeu estar true. QUando mudo para false aqui, ele para de chamar o random().
    }
}
