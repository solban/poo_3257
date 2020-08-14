/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Solba
 */
public class Cpu {
    private String marca;
    private float velocida;
    private int numeroNucleos;

    public Cpu() {
    }

    public Cpu(String marca, float velocida, int numeroNucleos) {
        this.marca = marca;
        this.velocida = velocida;
        this.numeroNucleos = numeroNucleos;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocida() {
        return velocida;
    }

    public void setVelocida(float velocida) {
        this.velocida = velocida;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", velocida=" + velocida + ", numeroNucleos=" + numeroNucleos + '}';
    }
    
}
