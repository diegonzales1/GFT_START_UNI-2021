/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02_gft;

/**
 *
 * @author Diego
 */
import java.util.Scanner;
public class Exercicio02_GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vezes;
        
        String elefante = "Incomoda";
        
        System.out.print("Digite quantas vezes quer a música do elefante: ");
        vezes = input.nextInt();
        
        if(vezes > 0){
            for(int i=1; i <= vezes; i++){
                System.out.print(" " + elefante + " ");
            }
        }
        
        System.out.println("muito mais");
    }
    
}
