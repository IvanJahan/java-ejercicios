package Ejercicio08;

import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in);

    public CadenaEntidad ingreseFrase() {
        CadenaEntidad frase = new CadenaEntidad();
        System.out.print("Ingrese una frase: ");
        frase.setFrase(leer.nextLine());
        frase.setFrase(frase.getFrase().toUpperCase());
        frase.setLongitud(frase.getFrase().length());
        return frase;
    }

    public void contarVocales(CadenaEntidad frase) {
        System.out.println("-- METODO CONTAR VOCALES --");
        int cantVocales = 0;
        String vocal = "";
        for (int i = 0; i < frase.getLongitud(); i++) {
            vocal = frase.getFrase().substring(i, i + 1);
            if (vocal.equals("A") || vocal.equals("E") || vocal.equals("I") || vocal.equals("O") || vocal.equals("U")) {
                cantVocales++;
            }
        }
        System.out.println("La frase " + frase.getFrase() + " contiene " + cantVocales + " vocales.");
    }

    public void invertirFrase(CadenaEntidad frase) {
        System.out.println("-- METODO INVERTIR FRASE --");
        StringBuilder revertir = new StringBuilder(frase.getFrase());
        System.out.println("Entrada: " + frase.getFrase());
        System.out.println("Salida: " + revertir.reverse());
    }

    public void vecesRepetido(CadenaEntidad frase) {
        System.out.println("-- METODO BUSCAR CARACTER REPETIDO --");
        System.out.print("Ingrese un caracter a buscar en la frase 1: ");
        String caracter = leer.nextLine().toUpperCase();
        String letraAnalisis = "";
        int cantVeces = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            letraAnalisis = frase.getFrase().substring(i, i + 1);
            if (letraAnalisis.equals(caracter)) {
                cantVeces++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + cantVeces + " veces");
    }

    public void compararLongitud(CadenaEntidad frase1, CadenaEntidad frase2) {
        System.out.println("-- METODO COMPARAR LONGITUD --");
        System.out.println("Longitud frase 1: " + frase1.getLongitud());
        System.out.println("Longitud frase 2: " + frase2.getLongitud());
        if (frase1.getLongitud() == frase2.getLongitud()) {
            System.out.println("La longitud de la frase 1 y frase 2 son iguales.");
        } else {
            System.out.println("La longitud de la frase 1 y frase 2 no son iguales.");
        }
    }

    public void unirFrases(CadenaEntidad frase1, CadenaEntidad frase2) {
        System.out.println("-- METODO UNIR FRASES --");
        String fraseUnida = frase1.getFrase().concat(" ").concat(frase2.getFrase());
        System.out.println("La nueva frase unida es: "+fraseUnida);
    }
    
    public void reemplazoCaracter(CadenaEntidad frase1, CadenaEntidad frase2){
        System.out.println("-- METODO REEMPLAZAR CARACTER --");
        System.out.print("Ingrese un caracter que desea insertar en la frase: ");
        String caracter = leer.nextLine();
        System.out.println("Se reemplazaran las letras A con el caracter "+caracter);
        String letraReemplazo = "";
        String nuevaFrase = frase1.getFrase().concat(" ").concat(frase2.getFrase());
        nuevaFrase = nuevaFrase.replace("A", caracter);
        System.out.println("La nueva frase con las letras A reemplazada es: "+nuevaFrase);
        
    }
    
    public void contieneCaracter (CadenaEntidad frase1, CadenaEntidad frase2){
        System.out.println("-- METODO COMPROBAR CARACTER --");
        System.out.print("Ingrese un caracter que desea buscar en la frase:");
        String caracter = leer.nextLine().toUpperCase();
        String nuevaFrase = frase1.getFrase().concat(" ").concat(frase2.getFrase());
        if (nuevaFrase.contains(caracter)) {
            System.out.println("El caracter ingresado "+"'"+caracter+"'"+" SI se encuentra en la frase.");            
        }else{
            System.out.println("El caracter ingresado "+"'"+caracter+"'"+" NO se encuentra en la frase.");
        }
    }

}
