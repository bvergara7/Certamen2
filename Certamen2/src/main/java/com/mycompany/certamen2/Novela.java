/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Luka Jacob y Benjamin Vergara
 */
class Novela extends Libro {
    private String genero;

    public Novela(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", precio=" + getPrecio() +
                ", genero='" + genero + '\'' +
                '}';
    }
}
