package Ejercicio04;

public class Rectangulo {

    //Atributos
    private Integer base;
    private Integer altura;

    //Método Constructor vacío:
    public Rectangulo() {
    }

    //Método Constructor explícito:
    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    //Metodo para calcular la superficio
    public void calculoSuperficie() {
        int superficie = base * altura;
        System.out.println("La superficie del rectángulo es: " + superficie);
    }

    //Metodo para calcular el perimetro
    public void calculoPerimetro() {
        int area = (base + altura) * 2;
        System.out.println("El área del rectángulo es: " + area);
    }

    //Metodo para dibujar el rectangulo
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
    }

}
