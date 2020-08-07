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
public class Automovil {
    private String marca;
    private String subMarca;
    private int modelo;
    private String color;
    //los comporatamientos
    //Metodos de Acceso
    public void setModelo(int mod){
        if(mod>=1914&&mod <=2020){
            this.modelo=mod;
        }else{
            System.out.println("Eses modelo esta fuera de rango");
        }
    }
    public int getModelo(){
        return this.modelo;
    }
    
    public void encender(){
        System.out.println("Encender auto");
    }  
    public void acelerar(){
        System.out.println("Acelerando"); 
    }    
        public float avanzar( int metros){
            
            float reales=0.0f;
            reales = (float) Math.random()*(float)metros;
            System.out.println("Avanzando el auto"+this.marca);
            return reales;
            
    
        }

    @Override
    public String toString() {
        return this.modelo
                    + this.marca+","+this.subMarca+","+","+this.color;
    }
        
        
}