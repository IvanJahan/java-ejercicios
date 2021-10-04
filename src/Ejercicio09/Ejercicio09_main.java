package Ejercicio09;

public class Ejercicio09_main {

    public static void main(String[] args) {
        
        MatematicaEntidad matematica = new MatematicaEntidad();
        MatematicaService matematica1 = new MatematicaService();
        
        //Se setean los numeros A y B
        matematica.setNumA(Math.random()*10);
        matematica.setNumB(Math.random()*10);
        System.out.println("El número A es: "+matematica.getNumA());
        System.out.println("El número B es: "+matematica.getNumB());
        
        System.out.println("");
        matematica1.devolverMayor(matematica.getNumA(), matematica.getNumB());
        System.out.println("");
        matematica1.calcularPotencia(matematica.getNumA(), matematica.getNumB());
        System.out.println("");
        matematica1.calcularRaiz(matematica.getNumA(), matematica.getNumB());
        System.out.println("");
    }
    
}
