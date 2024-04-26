package model_biblioteca;


import java.io.Serializable;
import java.util.Arrays;


public class Policiaca extends Libro {

    private String trama;
    private String[] personajes;

    public Policiaca() {
    }

    public Policiaca(String titulo, String autor, int numeroPaginas, String ISBN, String trama, String[] personajes) {
        super(titulo, autor, numeroPaginas, ISBN);
        this.trama = trama;
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Libro Policiaca{" + super.toString() +
                "trama='" + trama + '\'' +
                ", personajes=" + Arrays.toString(personajes) +
                '}';
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public String[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String[] personajes) {
        this.personajes = personajes;
    }
}
