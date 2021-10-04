package Ejercicio09;

public class MatematicaEntidad {
    //Atributos
    private double numA;
    private double numB;
    
    //Constructor vacio
    public MatematicaEntidad() {
    }
    
    //Constructor por parametros
    public MatematicaEntidad(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
    
    
    
}
