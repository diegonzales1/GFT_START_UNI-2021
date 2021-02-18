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
public abstract class Transporte {
    protected Carga carga;

    public abstract float calculaFrete();

    public Transporte(Carga carga) {
        this.carga = carga;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
    
    
  
    
    
    
}
