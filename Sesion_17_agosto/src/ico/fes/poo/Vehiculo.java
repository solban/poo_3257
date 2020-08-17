/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Solba
 */
public class Vehiculo {
   private String decripcion;
   private String fabricante;
   private String material;

    public Vehiculo() {
    }

    public Vehiculo(String decripcion, String fabricante, String material) {
        this.decripcion = decripcion;
        this.fabricante = fabricante;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "decripcion=" + decripcion + ", fabricante=" + fabricante + ", material=" + material + '}';
    }
   
   public void usar(){
       System.out.println("Utilizando vehiculo"+ decripcion );
   }
}
