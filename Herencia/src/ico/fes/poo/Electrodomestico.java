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
public class Electrodomestico {
    private String marca;
    private int modeloAño;
    private int tamaño;
    private int wattsConsumo;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, int modeloAño, int tamaño, int wattsConsumo) {
        this.marca = marca;
        this.modeloAño = modeloAño;
        this.tamaño = tamaño;
        this.wattsConsumo = wattsConsumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModeloAño() {
        return modeloAño;
    }

    public void setModeloAño(int modeloAño) {
        this.modeloAño = modeloAño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getWattsConsumo() {
        return wattsConsumo;
    }

    public void setWattsConsumo(int wattsConsumo) {
        this.wattsConsumo = wattsConsumo;
    }
    public void encender(){
        System.out.println("Encendiendo el electrodomestico");
    }
    public void apagar(){
        System.out.println("Apagando electodomestico");
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "marca=" + marca + ", modeloA\u00f1o=" + modeloAño + ", tama\u00f1o=" + tamaño + ", wattsConsumo=" + wattsConsumo + '}';
    }
    
}
