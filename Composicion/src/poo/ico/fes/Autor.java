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
public class Autor {
    private String nombreAutor;
    private int edadAutor;

    public Autor() {
    }

    public Autor(String nombreAutor, int edadAutor) {
        this.nombreAutor = nombreAutor;
        this.edadAutor = edadAutor;
    }

    public int getEdadAutor() {
        return edadAutor;
    }

    public void setEdadAutor(int edadAutor) {
        this.edadAutor = edadAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
        
    }
    

    @Override
    public String toString() {
        return "Autor{" + "nombreAutor=" + nombreAutor + ", edadAutor=" + edadAutor + '}';
    }
    
    
}
