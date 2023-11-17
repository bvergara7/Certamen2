/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;
import java.util.ArrayList;

/**
 *
 * @author Luka Jacob y Benjamin Vergara
 */
public class Certamen2 {

    public static void main(String[] args) {
        
        //Uso de coleccion de objetos. 
        ArrayList<Libro> libros = new ArrayList<>();

        Libro.insertarDatos(libros);

        //El codigo de libro sera equivalente a su nombre exacto. Con usos de espacio y tildes.
        //Tomando en cuenta los libros del metodo insertar libros.
        String codigoLibro = "Introducción a la Programación";
        Libro libroEncontrado = Libro.buscarLibro(libros, codigoLibro);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
