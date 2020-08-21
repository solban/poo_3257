/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_21_agosto;

import ico.fes.poo.Circulo;
import ico.fes.poo.Cuadrado;
import ico.fes.poo.Figura;

/**
 *
 * @author Solba
 */
public class Sesion_21_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1= new Circulo();
        c1.calcularArea();
        Cuadrado d1 = new Cuadrado(5,10);
        int res=d1.calcularArea();
        System.out.println("Area cuadrada= " + res);
        int opcion=0;
        //capturar opcion
        switch (opcion) {
            case 0:
                System.out.println("circulo");
                break;
                 case 1:
                System.out.println("cuadrado");
                break;
                 case 2:
                System.out.println("triangulo");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
