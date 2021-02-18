/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03_gft;

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
       
       Soma soma = new Soma();
       Subtracao subtracao = new Subtracao();
       Multiplicacao multiplicacao = new Multiplicacao();
       Divisao divisao = new Divisao();
       
       float x, y;
       
       System.out.print("Digite um número: ");
       x = input.nextFloat();
       
       System.out.print("Digite um número: ");
       y = input.nextFloat();
       
       soma.efetuarOperacao(x, y);
       subtracao.efetuarOperacao(x,y);
       multiplicacao.efetuarOperacao(x, y);
       divisao.efetuarOperacao(x, y);
       
    }
    
}
