package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08_main {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        CadenaService frase = new CadenaService();
        CadenaEntidad frase1 = frase.ingreseFrase();

        System.out.println("La frase 1 es: " + frase1.getFrase());
        System.out.println("Y la longitud de la frase 1 es: " + frase1.getLongitud());
        System.out.println("");
        frase.contarVocales(frase1);
        System.out.println("");
        frase.invertirFrase(frase1);
        System.out.println("");
        frase.vecesRepetido(frase1);
        System.out.println("");

        CadenaEntidad frase2 = frase.ingreseFrase();
        System.out.println("La frase 2 es: " + frase2.getFrase());
        System.out.println("");
        frase.compararLongitud(frase1, frase2);
        System.out.println("");
        frase.unirFrases(frase1, frase2);
        System.out.println("");
        frase.reemplazoCaracter(frase1, frase2);
        System.out.println("");
        frase.contieneCaracter(frase1, frase2);   
    }

}
