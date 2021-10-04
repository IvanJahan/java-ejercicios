package Ejercicio10;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio10_main {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        double arregloA[] = new double[50];
        double arregloB[] = new double[20];

        //LLENAR ARREGLO "A" CON NUMEROS ALEATORIOS
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.round(Math.random() * 100);
        }
        //IMPRIMIR ARREGLO "A"
        System.out.println("Arreglo A: ");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i]);
        }

        //ORDENAR ARREGLOS
        Arrays.sort(arregloA);
        System.out.println("Arreglo A ordenado: ");
        System.out.println(Arrays.toString(arregloA));

        //COPIAR PRIMEROS 10 ELEMENTOS DEL ARREGLO "A" AL ARREGLO "B" y LOS 10 ELEMENTOS RESTANTES CON 0.5
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);

        System.out.println("Arreglo A: ");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Arreglo B: ");
        System.out.println(Arrays.toString(arregloB));

    }

}
