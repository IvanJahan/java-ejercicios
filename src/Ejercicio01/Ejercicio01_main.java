/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.

 */
package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01_main {

    public static void main(String[] args) {

        Libro libro = cargarDatos();

        //Se muestra el resultado del Objeto
        System.out.println("Los datos del libro cargado son los siguientes:");
        System.out.println(libro);
        
        //prueba Repo
        
        //prubeaRepo22222
        
    }

    //Metodo para pedir datos al usuario, pero dentro del Main y no de la clase "Libro"
    public static Libro cargarDatos() {
        Scanner leer = new Scanner(System.in);

        Libro libro = new Libro();
        System.out.println("Ingrese el título del Libro:");
        libro.setTitulo(leer.nextLine());        
        System.out.println("Ingrese el autor del Libro:");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingrese el ISBN:");
        libro.setISBN(leer.nextInt());
        System.out.println("Ingrese el numero de páginas:");
        libro.setNumPaginas(leer.nextInt());
        return libro;

    }
}
