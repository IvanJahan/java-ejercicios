package Ejercicio02;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    //Método Constructor vacío:
    public Circunferencia() {
    }

    //Método Constructor explícito:
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo para calcular el area:
    public double area() {
        double area = Math.PI * radio;
        return area;
    }

    //Metodo para calcular el perimetro
    public double perimetro() {
        double perimetro = (2 * Math.PI * Math.pow(radio, 2));
        return perimetro;
    }
}
