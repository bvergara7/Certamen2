/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Luka Jacob y Benjamin Vergara
 */
class Academico extends Libro {
    private String area;

    public Academico(String titulo, String autor, double precio, String area) {
        super(titulo, autor, precio);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    @Override
    public String toString() {
        return "Libro Académico{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", precio=" + getPrecio() +
                ", area='" + area + '\'' +
                '}';
    }
}
