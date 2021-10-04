package Ejercicio12;

import java.util.Date;

public class PersonaEntidad {

    //Atributos
    private String nombre;
    private Date fechaNac;

    //Constructor vacio
    public PersonaEntidad() {
    }

    //Constructor por parámetros
    public PersonaEntidad(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
