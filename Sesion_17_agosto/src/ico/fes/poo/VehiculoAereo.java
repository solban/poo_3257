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
public class VehiculoAereo extends Vehiculo{
    private int numeroMotores;
    private String tipoMotor;
    private float millaaPorHora;

    public VehiculoAereo() {
    }

    public VehiculoAereo(int numeroMotores, String tipoMotor, float millaaPorHora) {
        this.numeroMotores = numeroMotores;
        this.tipoMotor = tipoMotor;
        this.millaaPorHora = millaaPorHora;
    }

    public VehiculoAereo(int numeroMotores, String tipoMotor, float millaaPorHora, String decripcion, String fabricante, String material) {
        super(decripcion, fabricante, material);
        this.numeroMotores = numeroMotores;
        this.tipoMotor = tipoMotor;
        this.millaaPorHora = millaaPorHora;
    }

    public float getMillaaPorHora() {
        return millaaPorHora;
    }

    public void setMillaaPorHora(float millaaPorHora) {
        this.millaaPorHora = millaaPorHora;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "VehiculoAereo{" + "numeroMotores=" + numeroMotores + ", tipoMotor=" + tipoMotor + ", millaaPorHora=" + millaaPorHora + '}' + super.toString();
    }

    @Override
    public void usar() {
        System.out.print("Volando a 10 mil Km de altura..... ");
    }
    
}
