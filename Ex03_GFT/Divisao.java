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
public class Divisao extends Operacao{

    @Override
    public void efetuarOperacao(float x, float y) {
        if(x == 0 || y == 0){
            System.out.println("Impossivel dividir por 0");
        }else {
            float div = x / y;
            System.out.println("A divisão é: " + div);
        }
    }
    
}
