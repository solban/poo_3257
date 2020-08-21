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
public class Licuadora extends Electrodomestico{
    private int numRevoluciones;
    private String vasoMaterial;
    private boolean cuchillaAcero;
    private String tipoMotor;

    public Licuadora() {
    }

    public Licuadora(int numRevoluciones, String vasoMaterial, boolean cuchillaAcero, String tipoMotor, String marca, int modeloAño, int tamaño, int wattsConsumo) {
        super(marca, modeloAño, tamaño, wattsConsumo);
        this.numRevoluciones = numRevoluciones;
        this.vasoMaterial = vasoMaterial;
        this.cuchillaAcero = cuchillaAcero;
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getNumRevoluciones() {
        return numRevoluciones;
    }

    public void setNumRevoluciones(int numRevoluciones) {
        this.numRevoluciones = numRevoluciones;
    }

    public String getVasoMaterial() {
        return vasoMaterial;
    }

    public void setVasoMaterial(String vasoMaterial) {
        this.vasoMaterial = vasoMaterial;
    }

    public boolean isCuchillaAcero() {
        return cuchillaAcero;
    }

    public void setCuchillaAcero(boolean cuchillaAcero) {
        this.cuchillaAcero = cuchillaAcero;
    }
    public void encender(){
        System.out.println("Encendiendo Motor");
        
    }
    public void apagar(){
            System.out.println("Apagando motor");
    }

    @Override
    public String toString() {
        return "Licuadora{" + "numRevoluciones=" + numRevoluciones + ", vasoMaterial=" + vasoMaterial + ", cuchillaAcero=" + cuchillaAcero + ", tipoMotor=" + tipoMotor + '}';
    }
    
}
