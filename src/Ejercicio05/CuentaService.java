package Ejercicio05;

import java.util.Scanner;

public class CuentaService {

    //Metodo para que el usuario ingrese los datos 
    public CuentaEntidad ingresarDatos() {
        Scanner leer = new Scanner(System.in);
        CuentaEntidad cuenta = new CuentaEntidad();
        System.out.print("Ingrese el número de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese el DNI: ");
        cuenta.setDNI(leer.nextLong());
        System.out.print("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }

    //Metodo para ingresar dinero
    public void ingresarDinero(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a depositar: ");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());
    }

    //Metodo para retirar dinero
    public void retirarDinero(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        double retDinero = leer.nextDouble();
        if (retDinero <= cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retDinero);
            System.out.println("Extracción realizada con éxito.");
        } else {
            System.out.println("El saldo actual de la cuenta es menor al importe que desea retirar.");
        }
    }

    // Metodo para realizar una extraccion rápida
    public void extraccionRapida(CuentaEntidad cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a retirar: ");
        double extracRapida = leer.nextDouble();
        if ((extracRapida / cuenta.getSaldoActual()) < 0.20) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - extracRapida);
            System.out.println("Extracción realizada con éxito.");
        } else {
            System.out.println("El importe a retirar supera el limite establecido. Comuniquese con At. al Cliente.");
        }
    }

    //Metodo para consultar el saldo de la cuenta
    public void consultarSaldo(CuentaEntidad cuenta) {
        System.out.println("El saldo actual de la cuenta es: " + cuenta.getSaldoActual());
    }

    //Metodo para consultar los datos de la cuenta
    public void mostrarDatos(CuentaEntidad cuenta) {
        System.out.println("Los datos de la cuenta son:");
        System.out.println("Número de cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente es: " + cuenta.getDNI());
        System.out.println("Saldo actual de la cuenta n° " + cuenta.getNumeroCuenta() + " : " + cuenta.getSaldoActual());
    }
}
