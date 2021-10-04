package Ejercicio01;

public class Libro {

    //Atributos
    public Integer ISBN;
    public String titulo;
    public String autor;
    public Integer numPaginas;

    //Constructor Vacío
    public Libro() {
    }

    //Constructor Específico
    public Libro(Integer ISBN, String titulo, String autor, Integer numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nISBN: "+ISBN+"\nPaginas: "+numPaginas;
    }
}
