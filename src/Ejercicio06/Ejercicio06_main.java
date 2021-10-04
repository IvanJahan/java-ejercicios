package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06_main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CafeteraService cafe = new CafeteraService();
        CafeteraEntidad cafetera1 = cafe.crearCafetera();
        cafe.llenarCafetera(cafetera1);
        cafe.servirCafe(cafetera1);
        cafe.mostrarCapacidad(cafetera1);
        cafe.agregarCafe(cafetera1);
        cafe.mostrarCapacidad(cafetera1);
        cafe.vaciarCafetera(cafetera1);
        
        

    }

}
