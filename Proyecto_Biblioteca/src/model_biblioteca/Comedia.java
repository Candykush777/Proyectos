package model_biblioteca;


import java.io.Serializable;

public class Comedia extends Libro {

    private String tipohumor;

    public Comedia() {
    }

    public Comedia(String titulo, String autor, int numeroPaginas, String ISBN, String tipohumor) {
        super(titulo, autor, numeroPaginas, ISBN);
        this.tipohumor = tipohumor;

    }

    @Override
    public String toString() {
        return "Libro Comedia{" +super.toString()+
                "tipohumor='" + tipohumor + '\'' +
                '}';
    }



    public String getTipohumor() {
        return tipohumor;
    }

    public void setTipohumor(String tipohumor) {
        this.tipohumor = tipohumor;
    }
}
