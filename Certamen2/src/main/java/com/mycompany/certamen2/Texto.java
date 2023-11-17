/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Luka Jacob y Benjamin Vergara
 */
class Texto extends Libro {
    private String escuela;

    public Texto(String titulo, String autor, double precio, String escuela) {
        super(titulo, autor, precio);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Libro de Texto{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", precio=" + getPrecio() +
                ", escuela='" + escuela + '\'' +
                '}';
    }
}
