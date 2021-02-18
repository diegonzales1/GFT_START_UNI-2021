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
public class Caminhao extends Transporte{
    public float frete;

    public Caminhao( Carga carga) {
        super(carga);
    }

    

    @Override
    public float calculaFrete(){
    frete = (float) ((carga.valor*0.3)+(carga.peso*0.12));
     if(carga.peso > 40.000)
      {
        frete =(float) (frete + (frete * (0.75)));
      }
     
     return frete;
    }
}
