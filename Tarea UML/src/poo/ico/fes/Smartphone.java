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
public class Smartphone {
    private int peso;
    private int tamPantalla;
    private String marca;
    private float modelo;
    
    public void setPeso(int pes){
        this.peso=pes;
    }
    public void setTamPantalla(int pan){
        this.tamPantalla=pan;
    }
    public void setMarca(String mar){
        this.marca=mar;
       
    }
    public void setModelo(float mod){
        this.modelo=mod;
    }
     public void encender(){
        System.out.println("Encendiendo Smartphone");
    }  
    public void apagar(){
        System.out.println("Apagando Smartphone"); 
       
    }
    public void aplicacion(){
        System.out.println("Abriendo aplicacion");
    }
    }
