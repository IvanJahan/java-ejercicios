package Ejercicio08;

public class CadenaEntidad {

    //Atributos
    private String frase;
    private Integer longitud;

    //Constructor vacío
    public CadenaEntidad() {
    }

    //Constructor por parámetros
    public CadenaEntidad(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

}
