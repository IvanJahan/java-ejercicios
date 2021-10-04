package Ejercicio07;

import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public PersonaEntidad crearPersona() {
        PersonaEntidad persona = new PersonaEntidad();
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.print("Ingrese el sexo (H=Hombre, M=Mujer, O=Otro): ");
        persona.setSexo(leer.next().toUpperCase());
        while (!persona.getSexo().equals("H") && !persona.getSexo().equals("M") && !persona.getSexo().equals("O")) {
            System.out.print("El sexo es incorrecto. Vuelva a ingresarlo: ");
            persona.setSexo(leer.next().toUpperCase());
        }
        System.out.print("Ingrese el peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura: ");
        persona.setAltura(leer.nextDouble());
        return persona;

    }

    public Integer calcularIMC(PersonaEntidad persona) {
        double IMC = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        int valorIMC = 0;
        if (IMC < 20) {
            valorIMC = -1;
        } else if (IMC > 20 && IMC < 25) {
            valorIMC = 0;
        } else if (IMC > 25) {
            valorIMC = 1;
        }
        return valorIMC;
    }

    public boolean esMayorDeEdad(PersonaEntidad persona) {
        boolean mayorEdad = false;
        if (persona.getEdad() >= 18) {
            mayorEdad = true;
        }
        return mayorEdad;
    }

    public void calcularObesidad(Integer valorIMC, String nombre) {
        switch (valorIMC) {
            case -1:
                System.out.println(nombre + " está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(nombre + " está con el peso ideal.");
                break;
            case 1:
                System.out.println(nombre + " está con sobrepeso.");
                break;
            default:
        }
    }

    public void calculoMayorEdad(boolean esMayorEdad, String nombre) {
        if (esMayorEdad == true) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

}
