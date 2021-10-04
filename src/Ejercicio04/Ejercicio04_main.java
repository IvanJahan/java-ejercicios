/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04_main {

    
    public static void main(String[] args) {
        
        Rectangulo rectangulo = ingresarDatos();
        rectangulo.calculoSuperficie();
        rectangulo.calculoPerimetro();
        rectangulo.dibujarRectangulo();
    }
    
    //Metodo para solicitar datos al usuario
    public static Rectangulo ingresarDatos(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese el valor de la Base: ");
        rectangulo.setBase(leer.nextInt());
        System.out.print("Ingrese el valor de la Altura: ");
        rectangulo.setAltura(leer.nextInt());
        return rectangulo;
    }
}
