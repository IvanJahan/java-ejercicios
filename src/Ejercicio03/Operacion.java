package Ejercicio03;

public class Operacion {

    private Integer num1;
    private Integer num2;

    //Método Constructor vacío:
    public Operacion() {
    }

    //Método Constructor explícito:
    public Operacion(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    //Metodo para sumar:
    public void metodoSuma() {
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }

    //Metodo para restar:
    public void metodoRestar() {
        int resta = num1 - num2;
        System.out.println("La resta de los numeros ingresados es: " + resta);
    }

    //Metodo para multiplicar:
    public void metodoMultiplicar() {
        if (num2 == 0) {
            System.out.println("ERROR. El multiplicador ingresado (Numero 2) es 0");
        } else {
            int multiplicacion = num1 * num2;
            System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicacion);
        }
    }

    //Metodo para dividir:
    public void metodoDividir() {
        if (num2 == 0) {
            System.out.println("ERROR. El divisor ingresado (Numero 2) es 0");
        } else {
            double division = (double)num1 / num2;
            System.out.println("La division de los numeros ingresados es: " + division);
        }
    }
}