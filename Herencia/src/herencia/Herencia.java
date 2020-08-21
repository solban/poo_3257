/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.poo.Electrodomestico;
import ico.fes.poo.Licuadora;
import ico.fes.poo.Refrigerador;

/**
 *
 * @author Solba
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico e1= new Electrodomestico();
        System.out.println(e1);
        Refrigerador r1 =new Refrigerador();
        System.out.println(r1);
        Licuadora l1 = new Licuadora();
        System.out.println(l1);
             
        
    }
    
}
