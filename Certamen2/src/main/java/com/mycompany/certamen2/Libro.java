/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Luka Jacob y Benjamin Vergara
 */
public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro() {
    }
    
    

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static Libro buscarLibro(ArrayList <Libro> libros, String codigo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }
    
    public static void insertarDatos(ArrayList<Libro> libros) {
        
        libros.add(new Academico("Introducción a la Programación", "John Doe", 29.99, "Informatica"));
        libros.add(new Novela("Harry Potter y la Orden del Fenix", "J.K. Rowling", 19.99, "Fantasía"));
        libros.add(new Texto("Libro de Texto 99", "James Cameron", 39.99, "Escuela de Ciencia de Datos"));
    }
    
    //Sobreescritura en caso de estudio.
    @Override
    public String toString() {
        return "Libro{" + 
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
