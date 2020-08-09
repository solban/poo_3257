/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;

/**
 *
 * @author Solba
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miCarro = new Automovil();
        miCarro.setMarca("vw");
        miCarro.setSubMarca("Golf");
        
        miCarro.setColor("Gris");
        miCarro.setModelo(1990);
        float x = miCarro.avanzar(1000);
        System.out.println("Avanzados="+ x);
        
        Automovil miCarroDos=new Automovil();
        //miCarroDos.marca="Ford";
        //miCarroDos.submarca="Mustang";
        System.out.println("Avanzados="+miCarroDos.avanzar(500));
        
        
        
        System.out.println(miCarro.toString());
                }
    
}
