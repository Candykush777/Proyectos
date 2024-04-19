package controller_biblioteca;


import model_biblioteca.Libro;

import java.util.ArrayList;
import java.util.Scanner;


public  class Biblioteca {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String director;
    private Catalogo catalogo;

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
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
    public void agregarLibro(Libro libro) {
        if (catalogo != null) {
            catalogo.agregarLibro(libro);
        } else {
            System.out.println("Error: No se ha construido el catálogo.");
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
                break; // Salir del bucle una vez que se haya encontrado el libro
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado en el catálogo.");
        }
    }
    public void mostrarLibrosEnCatalogo() {
        if (catalogo != null) {
            catalogo.mostrarLibros();
        } else {
            System.out.println("Error: El catálogo no ha sido construido.");
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                '}';
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

        public void agregarLibro(Libro libro) {
            if (libros.size() < capacidadMaxima) {
                libros.add(libro);
                System.out.println("Libro agregado al catálogo.");
            } else {
                System.out.println("El catálogo está lleno, no se pueden agregar más libros.");
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
    }
}

