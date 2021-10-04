package Ejercicio06;

import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in);

    public CafeteraEntidad crearCafetera() {
        CafeteraEntidad cafetera = new CafeteraEntidad();
        cafetera.setCantidadActual(0);
        return cafetera;
    }

    //Metodo llenar cafetera
    public void llenarCafetera(CafeteraEntidad cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    //Metodo para servir café    
    public void servirCafe(CafeteraEntidad cafetera) {
        System.out.println("Ingrese el tamaño de la taza vacia:");
        int taza = leer.nextInt();
        if (taza >= cafetera.getCantidadActual()) {
            int cantServir = cafetera.getCantidadActual();
            cafetera.setCantidadActual(cafetera.getCantidadActual() - cantServir);
            System.out.println("La taza no se llenó.");
            System.out.println("La taza quedó en: " + cantServir);
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("La taza se ha llenado.");
            System.out.println("La taza quedó en: " + taza);
        }
    }

    //Metodo para agregar café
    public void agregarCafe(CafeteraEntidad cafetera) {
        System.out.println("Ingrese la cantidad de cafe que desea agregar:");

        do {
            int cargaCafe = leer.nextInt();
            if ((cargaCafe + cafetera.getCantidadActual()) > 100) {
                System.out.println("La cantidad que desea agregar supera la capacidad máxima de la cafetera (cap.Max. 100");
                System.out.println("Ingrese una nueva cantidad a agregar:");

            } else {
                System.out.println("La cantidad ingresada no supera la capacidad máxima de la cafetera.");
                cafetera.setCantidadActual(cafetera.getCantidadActual() + cargaCafe);
            }

        } while ((cafetera.getCantidadActual()) < 100);
        System.out.println("La cantidad de café actual es: " + cafetera.getCantidadActual());
    }

    //Metodo para mostrar la capacidad de la cafetera
    public void mostrarCapacidad(CafeteraEntidad cafetera) {
        System.out.println("La capacidad actual de la cafetera es: " + cafetera.getCantidadActual());
    }

    //Metodo para vaciar la cafetera
    public void vaciarCafetera(CafeteraEntidad cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Cantidad actual en cafetera: " + cafetera.getCantidadActual());
    }
}
