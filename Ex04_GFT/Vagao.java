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
public class Vagao extends Transporte{
    public float frete;

    public Vagao(Carga carga) {
        super(carga);
    }
    
    @Override
    public float calculaFrete(){
     frete = (float) ((carga.valor*0.1)+(carga.peso*0.2));
        if(carga.peso < 15.000)
        {
          frete+=5000;
        }
        return frete;
    }
}
