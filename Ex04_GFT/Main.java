/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04_gft;

/**
 *
 * @author Diego
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor, peso;
        
        System.out.println("Digite o valor da carga: ");
        valor = input.nextFloat();
        
        System.out.println("Digite o peso da carga: ");
        peso = input.nextFloat();
        
        Carga carg = new Carga(valor, peso);
        
        Caminhao cam = new Caminhao(carg);
        Vagao vag = new Vagao(carg);
        
        System.out.print("Frete Vagão: R$"+ vag.calculaFrete() + "Frete Caminhão: R$" + cam.calculaFrete());
        
        
        
    }
    
}
