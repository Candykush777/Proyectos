package controller_biblioteca;


import model_biblioteca.Libro;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Biblioteca {

    private String nombre;
    private String director;
    private ArrayList<Libro> libros;

    public Biblioteca() {

        this.libros = new ArrayList<>();
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.libros = new ArrayList<>();
    }

    // Agrega un libro directamente a la lista de libros de la biblioteca
    public void agregarLibroBiblioteca(Libro libro) {
        libros.add(libro);
    }

    // Elimina un libro de la lista de libros de la biblioteca
    public void eliminarLibroBiblioteca(Libro libro) {
        libros.remove(libro);
    }

    // Busca un libro por su ISBN en la lista de libros de la biblioteca
    public Libro buscarLibroPorISBNBiblioteca(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getISBN().equals(isbn)) {
                return libro;
            }
        }
        // Si no se encuentra el libro
        System.out.println("No se encontró ningún libro con el ISBN proporcionado en la biblioteca.");
        return null;
    }

    public Catalogo construirCatalogo(int tamanoCatalogo, String isbn) {
        if (tamanoCatalogo <= 0) {
            System.out.println("Error: El tamaño del catálogo debe ser mayor que cero.");
            return null;
        }

        Catalogo catalogo = new Catalogo(tamanoCatalogo);
        System.out.println("Catálogo construido con éxito.");

        // Realizar búsqueda del libro por ISBN en el catálogo recién construido, solución salomónica
        Libro libroEncontrado = catalogo.buscarLibroPorISBNCatalogo(isbn);
        if (libroEncontrado != null) {
            System.out.println("Información del libro encontrado en el catálogo:");
            System.out.println(libroEncontrado.toString());
        } else {
            System.out.println("No se encontró ningún libro con el ISBN proporcionado en el catálogo.");
        }

        return catalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    public class Catalogo {

        private ArrayList<Libro> libros;
        private int capacidadMax;

        public Catalogo(int capacidadMax) {
            this.libros = new ArrayList<>();
            this.capacidadMax = capacidadMax;
        }

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public void eliminarLibro(Libro libro) {
            libros.remove(libro);
        }

        public Libro buscarLibroPorISBNCatalogo(String isbn) {
            for (Libro libro : libros) {
                if (libro.getISBN().equals(isbn)) {
                    return libro;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            if (libros.isEmpty()) {
                return "El catálogo está vacío.";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Lista de libros en el catálogo:\n");
            for (Libro libro : libros) {
                sb.append(libro.toString()).append("\n");
            }
            return sb.toString();
        }


        public ArrayList<Libro> getLibros() {
            return libros;
        }

        public void setLibros(ArrayList<Libro> libros) {
            this.libros = libros;
        }

        public int getCapacidadMax() {
            return capacidadMax;
        }

        public void setCapacidadMax(int capacidadMax) {
            this.capacidadMax = capacidadMax;
        }


    }
}

