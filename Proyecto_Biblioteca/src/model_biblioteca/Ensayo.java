package model_biblioteca;


public class Ensayo extends Libro{

    public Ensayo() {
    }

    public Ensayo(String titulo, String autor, int numeroPaginas, String ISBN) {
        super(titulo, autor, numeroPaginas, ISBN);
    }

    @Override
    public String toString() {
        return "Libro Ensayo{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroPaginas=" + getNumeroPaginas() +
                ", ISBN='" + getISBN() + '\'' +
                '}';
    }

}



