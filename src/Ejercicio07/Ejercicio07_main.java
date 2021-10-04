package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07_main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        PersonaService persona = new PersonaService();

        System.out.println("PERSONA 1");
        System.out.println("Ingrese los datos de la Persona 1:");
        PersonaEntidad persona1 = persona.crearPersona();
        persona.calcularObesidad(persona.calcularIMC(persona1), persona1.getNombre());
        persona.calculoMayorEdad(persona.esMayorDeEdad(persona1), persona1.getNombre());
        double c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        //Esto es para ir guardando la cantidad de personas de bajo peso, peso ideal y sobrepeso
        if (persona.calcularIMC(persona1) == -1) {
            c1 = c1 + 1;
        } else if (persona.calcularIMC(persona1) == 0) {
            c2 = c2 + 1;
        } else if (persona.calcularIMC(persona1) == 1) {
            c3 = c3 + 1;
        }
        //Esto es para ir guardando la cantidad de personas que son mayor de edad y cuales son menores de edad
        if (persona.esMayorDeEdad(persona1) == true) {
            c4 = c4 + 1;
        }else{
            c5=c5+1;
        }

        System.out.println("PERSONA 2");
        System.out.println("Ingrese los datos de la Persona 2:");
        PersonaEntidad persona2 = persona.crearPersona();
        persona.calcularObesidad(persona.calcularIMC(persona2), persona2.getNombre());
        persona.calculoMayorEdad(persona.esMayorDeEdad(persona2), persona2.getNombre());
        if (persona.calcularIMC(persona2) == -1) {
            c1 = c1 + 1;
        } else if (persona.calcularIMC(persona2) == 0) {
            c2 = c2 + 1;
        } else if (persona.calcularIMC(persona2) == 1) {
            c3 = c3 + 1;
        }
        //Esto es para ir guardando la cantidad de personas que son mayor de edad y cuales son menores de edad
        if (persona.esMayorDeEdad(persona2) == true) {
            c4 = c4 + 1;
        }else{
            c5=c5+1;
        }
        
        System.out.println("PERSONA 3");
        System.out.println("Ingrese los datos de la Persona 3:");
        PersonaEntidad persona3 = persona.crearPersona();
        persona.calcularObesidad(persona.calcularIMC(persona3), persona3.getNombre());
        persona.calculoMayorEdad(persona.esMayorDeEdad(persona3), persona3.getNombre());
        if (persona.calcularIMC(persona3) == -1) {
            c1 = c1 + 1;
        } else if (persona.calcularIMC(persona3) == 0) {
            c2 = c2 + 1;
        } else if (persona.calcularIMC(persona3) == 1) {
            c3 = c3 + 1;
        }
        //Esto es para ir guardando la cantidad de personas que son mayor de edad y cuales son menores de edad
        if (persona.esMayorDeEdad(persona3) == true) {
            c4 = c4 + 1;
        }else{
            c5=c5+1;
        }
        
        System.out.println("PERSONA 4");
        System.out.println("Ingrese los datos de la Persona 4:");
        PersonaEntidad persona4 = persona.crearPersona();
        persona.calcularObesidad(persona.calcularIMC(persona4), persona4.getNombre());
        persona.calculoMayorEdad(persona.esMayorDeEdad(persona4), persona4.getNombre());
        if (persona.calcularIMC(persona4) == -1) {
            c1 = c1 + 1;
        } else if (persona.calcularIMC(persona4) == 0) {
            c2 = c2 + 1;
        } else if (persona.calcularIMC(persona4) == 1) {
            c3 = c3 + 1;
        }
        //Esto es para ir guardando la cantidad de personas que son mayor de edad y cuales son menores de edad
        if (persona.esMayorDeEdad(persona4)) {
            c4 ++;
        }else{
            c5++;
        }
        
        System.out.println("El porcentaje de las personas que están por debajo del peso ideal es: " + ((c1 / 4) * 100) + "%");
        System.out.println("El porcentaje de las personas que están en su peso ideal es: " + ((c2 / 4) * 100) + "%");
        System.out.println("El porcentaje de las personas que están con sobrepeso es: " + ((c3 / 4) * 100) + "%");
        System.out.println("El porcentaje de personas mayor de edad es: "+ ((c4 / 4) * 100) + "%");
        System.out.println("El porcentaje de personas menores de edad es: "+ ((c5 / 4) * 100) + "%");

    }

}
