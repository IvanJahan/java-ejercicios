package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        System.out.print("Ingrese el año: ");
        int año = sc.nextInt()-1900;
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt()-1;
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        
        Date fecha = new Date(año,mes,dia);
        Date fechaActual = new Date();
        System.out.println("La fecha ingresada es: "+fecha);
        
        int diferenciaAños = fechaActual.getYear()-fecha.getYear();
        System.out.println("Entre la fecha actual y la fecha ingresada hay "+diferenciaAños+" años.");
        
    }

}
