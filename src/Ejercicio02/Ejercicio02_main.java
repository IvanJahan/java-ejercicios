/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02_main {
    public static void main(String[] args) {
   
        
        Circunferencia circunferencia = setearDatos();       
        System.out.println("El área de la circunferencia es: "+circunferencia.area());
        System.out.println("El perimetro de la circunferencia es: "+circunferencia.perimetro());        
    }
   //Metodo para solicitar el valor (argumento) de Radio al usuario    
    public static Circunferencia setearDatos(){
        Scanner leer = new Scanner(System.in);
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingrese el valor del Radio:");
        circunferencia.setRadio(leer.nextDouble());
//        double radio = leer.nextDouble();
        return circunferencia;
    }
}

