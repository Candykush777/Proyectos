package controller_biblioteca;


import model_biblioteca.CatalogoLlenoException;
import model_biblioteca.CatalogoNoConstruidoException;
import model_biblioteca.Libro;
import model_biblioteca.LibroNoencontradoException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


public  class Biblioteca {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String director;
    private Catalogo catalogo;
    private String tematica;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String director, String tematica) {
        this.nombre = nombre;
        this.director = director;
        this.tematica = tematica;
    }

    public void agregarLibro(Libro libro) throws CatalogoLlenoException {

        if (catalogo == null) {
            System.out.println("Error: No se ha construido el catálogo para esta biblioteca.");
            return;
        }

        String isbn = libro.getISBN();
        String tematicaLibro = "";

        if (!this.nombre.equals("All books")) { // Verificar si la biblioteca no es la biblioteca general
            if (isbn.endsWith("C")) {
                tematicaLibro = "Comedia";
            } else if (isbn.endsWith("E")) {
                tematicaLibro = "Ensayo";
            } else if (isbn.endsWith("T")) {
                tematicaLibro = "Terror";
            } else if (isbn.endsWith("P")) {
                tematicaLibro = "Policiaca";
            } else {
                System.out.println("Error: ISBN no válido para determinar la temática del libro.");
                return;
            }
        }


        if (!this.nombre.equals("All books") && !this.tematica.equalsIgnoreCase(tematicaLibro)) {
            System.out.println("Error: El libro no pertenece a esta biblioteca.");
            return;
        }

        if (catalogo.getLibros().size() >= catalogo.capacidadMaxima) {
            throw new CatalogoLlenoException("El catálogo está lleno, no se pueden agregar más libros, saltamos la Exception y sigue el programa");
        }

        catalogo.agregarLibro(libro);
        System.out.println("Libro agregado al catálogo de la biblioteca.");
    }



    public void verificarCatalogoConstruido() {
        if (catalogo == null) {
            throw new CatalogoNoConstruidoException("El catálogo no ha sido construido, Runtime");
        }
    }
    public void exportarLibros(String nombreArchivo) {
        if (catalogo == null) {
            System.out.println("Error: El catálogo no ha sido construido.");
            return;
        }

        try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
             BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut);
             ObjectOutputStream objectOut = new ObjectOutputStream(bufferedOut);
             OutputStreamWriter writer = new OutputStreamWriter(bufferedOut, StandardCharsets.UTF_8)) {

            objectOut.writeObject(catalogo.getLibros());
            System.out.println("Libros exportados correctamente al archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al exportar los libros: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void construirCatalogo() {
        System.out.println("Introduce el número de libros que se puede guardar en el Catálogo:");
        int tamanoCatalogo = scanner.nextInt();
        scanner.nextLine();
        if (tamanoCatalogo <= 0) {
            System.out.println("Error: El tamaño del catálogo debe ser mayor que cero.");
            return;
        }
        this.catalogo = new Catalogo(tamanoCatalogo);
    }
    public void construirCatalogo(int tamanoCatalogo) {
        if (tamanoCatalogo <= 0) {
            System.out.println("Error: El tamaño del catálogo debe ser mayor que cero.");
            return;
        }
        this.catalogo = new Catalogo(tamanoCatalogo);
    }

    public void numeroLibrosCatalogo(){
        if (catalogo != null) {
            int numeroLibros = catalogo.getLibros().size();
            System.out.println("Número de libros en el catálogo: " + numeroLibros);
        } else {
            System.out.println("El catálogo no ha sido construido.");
        }
    }


    public void sacarLibroDelCatalogo(String isbn) {
        if (catalogo != null) {
            catalogo.sacarLibro(isbn);
        } else {
            System.out.println("El catálogo no ha sido construido.");
        }
    }
    public void mostrarLibrosEnCatalogo() {
        if (catalogo != null) {
            catalogo.mostrarLibros();
        } else {
            System.out.println("Error: El catálogo no ha sido construido.");
        }
    }
    public void buscarLibroCatalogo() {
        if (catalogo == null) {
            System.out.println("Error: El catálogo no ha sido construido.");
            return;
        }
        System.out.println("Introduce ISBN para buscar el libro:");
        String isbnBuscado = scanner.nextLine();
        boolean encontrado = false;
        for (Libro libro : catalogo.getLibros()) {
            if (libro.getISBN().equals(isbnBuscado)) {
                System.out.println("Libro encontrado:");
                System.out.println(libro);
                encontrado = true;
                return; // Termina el método después de encontrar el libro
            }
        }
        try {
            throw new LibroNoencontradoException("Libro no encontrado en el catálogo, saltamos Exception para continuar el programa");
        } catch (LibroNoencontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", tematica='" + tematica + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
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

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    class Catalogo {
        private ArrayList<Libro> libros;
        private int capacidadMaxima;

        public Catalogo(int capacidadMaxima) {
            this.libros = new ArrayList<>();
            this.capacidadMaxima = capacidadMaxima;
        }

        public void agregarLibro(Libro libro) throws CatalogoLlenoException {
            if (libros.size() < capacidadMaxima) {
                libros.add(libro);
                System.out.println("Libro agregado al catálogo.");
            } else {
                throw new CatalogoLlenoException("El catálogo está lleno, no se pueden agregar más libros.");
            }
        }

        public ArrayList<Libro> getLibros() {
            return libros;
        }
        public void mostrarLibros() {
            System.out.println("Libros en el catálogo:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
        public void sacarLibro(String isbn) {
            for (Libro libro : libros) {
                if (libro.getISBN().equals(isbn)) {
                    libros.remove(libro);
                    System.out.println("Libro retirado del catálogo.");
                    return;
                }
            }
            System.out.println("No se encontró ningún libro con el ISBN especificado en el catálogo.");
        }
    }
}

