package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05_main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CuentaService cta = new CuentaService();
        CuentaEntidad cuenta = cta.ingresarDatos();

        System.out.println("Seleccione la opción que desee:");
        System.out.println("A. Ingresar Dinero");
        System.out.println("B. Retirar Dinero");
        System.out.println("C. Extracción Rápida");
        System.out.println("D. Consultar Saldo");
        System.out.println("E. Consultar Datos");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        
        switch (opcion) {
            case "A":
                System.out.println("Ingresar Dinero:");
                cta.ingresarDinero(cuenta);
                break;
            case "B":
                System.out.println("Retirar Dinero:");
                cta.retirarDinero(cuenta);
                cta.consultarSaldo(cuenta);
                break;
            case "C":
                System.out.println("Extracción Rápida:");
                cta.extraccionRapida(cuenta);
                break;
            case "D":
                System.out.println("Consultar Saldo:");
                cta.consultarSaldo(cuenta);
                break;
            case "E":
                System.out.println("Consultar Datos:");
                cta.mostrarDatos(cuenta);

                break;
            default:
                System.out.println("Ha seleccionado una opción inexistente.");
                System.out.println("Sesión Finalizada");

        }

//        
//        
    }

}
