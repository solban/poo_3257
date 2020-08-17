/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase.libro;

import poo.ico.fes.Autor;
import poo.ico.fes.Editorial;

/**
 *
 * @author Solba
 */
public class Libro {
    private String titulo;
    private String genero;
    private int numPaginas;
    private int volumen;
    private Autor autorLibro;
    private Editorial editorialPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String genero, int numPaginas, int volumen, Autor autorLibro, Editorial editorialPublicacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.volumen = volumen;
        this.autorLibro = autorLibro;
        this.editorialPublicacion = editorialPublicacion;
    }

    public Editorial getEditorialPublicacion() {
        return editorialPublicacion;
    }

    public void setEditorialPublicacion(Editorial editorialPublicacion) {
        this.editorialPublicacion = editorialPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", numPaginas=" + numPaginas + ", volumen=" + volumen + ", autorLibro=" + autorLibro + ", editorialPublicacion=" + editorialPublicacion + '}';
    }
    
    
   
    
}
