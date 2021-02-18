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
public class Soma extends Operacao{

    @Override
    public void efetuarOperacao(float x, float y) {
        float soma = x + y;
        System.out.println("A soma é:  " + soma);
    }
    
}
