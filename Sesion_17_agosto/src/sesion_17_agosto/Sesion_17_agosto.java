/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_17_agosto;

import ico.fes.poo.Vehiculo;
import ico.fes.poo.VehiculoAereo;
import ico.fes.poo.VehiculoTerrestre;

/**
 *
 * @author Solba
 */
public class Sesion_17_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 =new Vehiculo ("Motorizado con una adaptacion de"
        +"bicicleta de tamalero para transporte personas"
                ,"BMX","Metal");
        System.out.println(v1);
        v1.usar();
        System.out.println("-----------------------");
        
        Vehiculo v2 =new Vehiculo ("Vehiculo que vuela",
        "Desconocido", "Madera");
        System.out.println(v2);
        System.out.println("herencia");
        VehiculoTerrestre vt1=new VehiculoTerrestre();
        System.out.println(vt1);
        vt1.usar();
        
        VehiculoTerrestre vt2 = new VehiculoTerrestre(0, "210");
        vt2.setDecripcion("Auto semideportivo");
        vt2.setFabricante("Masda Co");
       
        vt2.setMaterial("fibra de vidrio");
        
        System.out.println(vt2);
        System.out.println("Vehiculo terrestre 3");
        VehiculoTerrestre vt3=new VehiculoTerrestre(1, "250",
                "Ferrocarril Clasico", "Aceros de Mexico","Acero");
        System.out.println(vt3);
        vt3.viajar();
        vt3.usar();
        
        System.out.println("Vehiculo aereo");
        VehiculoAereo va1=new VehiculoAereo(2, "Jet", 1000f);
        System.out.println(va1);
        va1.usar();
        Vehiculo vx =(Vehiculo)va1;
        vx.usar();
    }
    
}
