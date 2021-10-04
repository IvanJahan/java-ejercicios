package Ejercicio06;

public class CafeteraEntidad {

    //Atributos
    private Integer capacidadMaxima;
    private Integer cantidadActual;

    //Método Constructor vacío:
    public CafeteraEntidad() {
        this.capacidadMaxima = 100;
    }
    
    //Método Constructor explícito:
    public CafeteraEntidad(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
