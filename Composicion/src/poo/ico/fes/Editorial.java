/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ico.fes;

/**
 *
 * @author Solba
 */
public class Editorial {
    private String nombreEditorial;
    private String pais;
    private float direccion;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, String pais, float direccion) {
        this.nombreEditorial = nombreEditorial;
        this.pais = pais;
        this.direccion = direccion;
    }

    public float getDireccion() {
        return direccion;
    }

    public void setDireccion(float direccion) {
        this.direccion = direccion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", pais=" + pais + ", direccion=" + direccion + '}';
    }
    
  
    
}
