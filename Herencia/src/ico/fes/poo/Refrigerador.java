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
public class Refrigerador extends Electrodomestico{
    private boolean congelador;
    private int temperaturaInterna;
    private int numeroDeEstantes;
    private boolean controladorTemperatura;

    public Refrigerador() {
    }

    public Refrigerador(boolean congelador, int temperaturaInterna, int numeroDeEstantes, boolean controladorTemperatura, String marca, int modeloAño, int tamaño, int wattsConsumo) {
        super(marca, modeloAño, tamaño, wattsConsumo);
        this.congelador = congelador;
        this.temperaturaInterna = temperaturaInterna;
        this.numeroDeEstantes = numeroDeEstantes;
        this.controladorTemperatura = controladorTemperatura;
    }

    public boolean isControladorTemperatura() {
        return controladorTemperatura;
    }

    public void setControladorTemperatura(boolean controladorTemperatura) {
        this.controladorTemperatura = controladorTemperatura;
    }

    public boolean isCongelador() {
        return congelador;
    }

    public void setCongelador(boolean congelador) {
        this.congelador = congelador;
    }

    public int getTemperaturaInterna() {
        return temperaturaInterna;
    }

    public void setTemperaturaInterna(int temperaturaInterna) {
        this.temperaturaInterna = temperaturaInterna;
    }

    public int getNumeroDeEstantes() {
        return numeroDeEstantes;
    }

    public void setNumeroDeEstantes(int numeroDeEstantes) {
        this.numeroDeEstantes = numeroDeEstantes;
    }
    public void congelar(){
        System.out.println("Encendiendo Congelador");
    }
    public void temperatura(){
        System.out.println("Manteniedo temperatura optima");
    }
    

    @Override
    public String toString() {
        return "Refrigerador{" + "congelador=" + congelador + ", temperaturaInterna=" + temperaturaInterna + ", numeroDeEstantes=" + numeroDeEstantes + ", controladorTemperatura=" + controladorTemperatura + '}';
    }
    
    
    
}
