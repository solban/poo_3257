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
public class Circulo implements Figura{

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }
    @Override
    public void colorear() {
        System.out.println("Colorendo circulo");
    }

    @Override
    public int calcularArea() {
        System.out.println("Calculando area pi * r ^ 2");
        return 20;
    }
    
}
