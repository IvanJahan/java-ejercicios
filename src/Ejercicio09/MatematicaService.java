package Ejercicio09;

public class MatematicaService {

    public void devolverMayor(double numA, double numB) {
        if (numA > numB) {
            System.out.println("El numero A " + numA + " es mayor que el número B " + numB + ".");
        } else {
            System.out.println("El número B " + numB + " es mayor que el número A " + numA + ".");
        }
    }

    public void calcularPotencia(double numA, double numB) {
        double numMayor = numA;
        double numMenor = 0;

        if (numB > numMayor) {
            numMayor = numB;
            numMenor = numA;
        } else {
            numMenor = numB;
        }
        numMayor = Math.round(numMayor);
        numMenor = Math.round(numMenor);
        double potencia = Math.pow(numMayor, numMenor);
        System.out.println("La potencia del numero " + numMayor + " elevado al numero " + numMenor + " es: " + potencia);
    }

    public void calcularRaiz(double numA, double numB) {
        double numMenor = numA;

        if (numB > numMenor) {
            numMenor = numA;
        } else {
            numMenor = numB;
        }
        numMenor = Math.round(numMenor);
        numMenor = Math.abs(numMenor);
        double raizCuadrada = Math.sqrt(numMenor);
        System.out.println("La raiz cuadrada del numero " + numMenor + " es: " + raizCuadrada);

    }
}
