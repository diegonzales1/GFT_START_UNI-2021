/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01_gft;

/**
 *
 * @author Diego
 */
import java.util.Scanner;
public class Exercicio01_GFT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        

        
            System.out.println("Digite o primeiro numero: "); 
            num1 = input.nextInt(); 
            
            System.out.println("Digite o primeiro numero: "); 
            num2 = input.nextInt(); 
            
            System.out.println("Digite o primeiro numero: "); 
            num3 = input.nextInt(); 
        
            
            if(num1 > num2 && num1 > num3){
                System.out.println("O maior numero é: " + num1);
            }else if(num2 > num1 && num2 > num3){
                System.out.println("O maior numero é: " + num2);
            }else if(num3 > num1 && num3 > num2){
                System.out.println("O maior numero é: " + num3);
            } 
            if(num1 < num2 && num1 < num3){
                System.out.println("O menor numero é: " + num1);
            }else if(num2 < num1 && num2 < num3){
                System.out.println("O menor numero é: " + num2);
            }else if(num3 < num1 && num3 < num2){
                System.out.println("O menor numero é: " + num3);
            }else if(num1 == num2 && num2 == num3 && num3 == num1){
            System.out.println("Os números são iguais!");
            }
        
        
    }
    
}
