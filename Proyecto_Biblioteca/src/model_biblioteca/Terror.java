package model_biblioteca;


import java.io.Serializable;

public class Terror extends Libro {

    private String calificacion;

    public Terror() {
    }

    public Terror(String titulo, String autor, int numeroPaginas, String ISBN, String calificacion) {
        super(titulo, autor, numeroPaginas, ISBN);
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Libro Terror: " + super.toString() + ", Calificación: " + calificacion;

    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
