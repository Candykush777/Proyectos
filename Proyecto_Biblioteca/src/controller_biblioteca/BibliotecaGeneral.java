package controller_biblioteca;

import model_biblioteca.Libro;

public class BibliotecaGeneral extends Biblioteca{

    public BibliotecaGeneral() {
    }

    public BibliotecaGeneral(String nombre, String director) {
        super(nombre, director, 0);
    }
    public void agregarLibro(Libro libro) {
        getCatalogo().agregarLibro(libro);
    }
    public void agregarLibroBiblioteca(Libro libro){
        if(this.getCatalogo()!=null){
            this.getCatalogo().agregarLibro(libro);
        }





    }
}
