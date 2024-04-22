
import controller_biblioteca.Biblioteca;
import model_biblioteca.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) throws CatalogoLlenoException, LibroNoencontradoException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> listaLibros = new ArrayList<>();

        Biblioteca bibliotecaGeneral = new Biblioteca("All books", "Eduardo Afán", "General");
        Biblioteca bibliotecaComedia = new Biblioteca("Groucho Marx", "Eduardo Afán", "Comedia");
        Biblioteca bibliotecaEnsayo = new Biblioteca("Michel de Montaigne", "Eduardo Afán", "Ensayo");
        Biblioteca bibliotecaPoliciaca = new Biblioteca("Agatha Christie", "Eduardo Afán", "Policiaca");
        Biblioteca bibliotecaTerror = new Biblioteca("Stephen King", "Eduardo Afán", "Terror");

//Contruimos el catalogo de 4 libros cómo dice el ejercicio

        bibliotecaGeneral.construirCatalogo(4);


        Terror libroTerror1 = new Terror("La Sombra del Viento", "Carlos Ruiz Zafón", 512, "1234T", "Mayor 18 años");
        Terror libroTerror2 = new Terror("El Laberinto de los Espíritus", "Carlos Ruiz Zafón", 1138, "5678T", "Mayor 18 años");
        Terror libroTerror3 = new Terror("La Catedral del Mar", "Ildefonso Falcones", 385, "9012T", "Mayor 18 años");
        Terror libroTerror4 = new Terror("La Casa de los Espíritus", "Isabel Allende", 253, "3456T", "Mayor 18 años");
        Terror libroTerror5 = new Terror("El Laberinto del Fauno", "Guillermo del Toro", 433, "7890T", "Mayor 18 años");
        Comedia libroComedia1 = new Comedia("La Colmena", "Camilo José Cela", 662, "2345C", "Irónico");
        Comedia libroComedia2 = new Comedia("Los Juegos del Hambre", "Suzanne Collins", 240, "2345C", "Absurdo");
        Comedia libroComedia3 = new Comedia("El Juego de Ender", "Orson Scott Card", 654, "4567C", "Negro");
        Comedia libroComedia4 = new Comedia("El Silmarillion", "J.R.R. Tolkien", 654, "4567C", "Negro");
        Comedia libroComedia5 = new Comedia("La Vida del Lazarillo de Tormes y de sus Fortunas y Adversidades", "Anónimo", 394, "8901C", "Satírico");
        Policiaca libroPoliciaca1 = new Policiaca("La Sombra del Viento", "Carlos Ruiz Zafón", 320, "4567P",
                "Espacio confinado", new String[]{"Detective John Smith", "Inspector Julia Johnson", "Sospechoso Richard Black"});
        Policiaca libroPoliciaca2 = new Policiaca("El Silencio de los Corderos", "Thomas Harris", 368, "1234P",
                "Asesinato en serie", new String[]{"Psicópata asesino: Hannibal Lecter, Agente del FBI: Clarice Starling, Víctima: Buffalo Bill"});
        Policiaca libroPoliciaca3 = new Policiaca("El Misterio de la Cripta Embrujada", "Eduardo Mendoza", 240, "2345P",
                "Investigación", new String[]{"Extraterrestre: Gurb, Escritor de Novelas Policiacas: David Giró, Padre de Gurb: Don Rosendo"});
        Policiaca libroPoliciaca4 = new Policiaca("Muerte en el Nilo", "Agatha Christie", 320, "3456P",
                "Crimen a bordo", new String[]{"Detective Privado: Hércules Poirot, Socialite: Linnet Ridgeway, Enamorada Obsesiva: Jacqueline de Bellefort"});
        Policiaca libroPoliciaca5 = new Policiaca("El Halcón Maltés", "Dashiell Hammett", 224, "5678P",
                "Busqueda objeto valioso", new String[]{"Detective Privado Cínico: Sam Spade, Mujer Fatal: Brigid O'Shaughnessy, Estafador: Joel Cairo"});
        Ensayo libroEnsayo1 = new Ensayo("El Quijote", "Miguel de Cervantes", 300, "6767E");
        Ensayo libroEnsayo2 = new Ensayo("La Celestina", "Fernando de Rojas", 400, "1234E");
        Ensayo libroEnsayo3 = new Ensayo("La Regenta", "Leopoldo Alas Clarín", 700, "5678E");
        Ensayo libroEnsayo4 = new Ensayo("El Conde Lucanor", "Don Juan Manuel", 350, "9012E");
        Ensayo libroEnsayo5 = new Ensayo("El Arte de la Guerra", "Sun Tzu", 250, "3456E");

        //Voy añadir todos los libros a la listalibros, para poder luego selecionar el que quiera y añadirlos al catalogo.
        listaLibros.add(libroComedia1);
        listaLibros.add(libroComedia2);
        listaLibros.add(libroComedia3);
        listaLibros.add(libroComedia4);
        listaLibros.add(libroComedia5);
        listaLibros.add(libroTerror1);
        listaLibros.add(libroTerror2);
        listaLibros.add(libroTerror3);
        listaLibros.add(libroTerror4);
        listaLibros.add(libroTerror5);
        listaLibros.add(libroEnsayo1);
        listaLibros.add(libroEnsayo2);
        listaLibros.add(libroEnsayo3);
        listaLibros.add(libroEnsayo4);
        listaLibros.add(libroEnsayo5);
        listaLibros.add(libroPoliciaca1);
        listaLibros.add(libroPoliciaca2);
        listaLibros.add(libroPoliciaca3);
        listaLibros.add(libroPoliciaca4);
        listaLibros.add(libroPoliciaca5);


        try {
            bibliotecaGeneral.agregarLibro(libroComedia1);
            bibliotecaGeneral.agregarLibro(libroTerror1);
            bibliotecaGeneral.agregarLibro(libroPoliciaca1);
            bibliotecaGeneral.agregarLibro(libroEnsayo1);
            bibliotecaGeneral.agregarLibro(libroComedia2);
        } catch (CatalogoLlenoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Libros en el catálogo de la biblioteca general:");
        bibliotecaGeneral.mostrarLibrosEnCatalogo();
        System.out.println("Lista de libros disponibles:");
        for (Libro libro : listaLibros) {
            System.out.println(libro.getTitulo() + " " + libro.getISBN());
        }
        System.out.println("------------------------------------------------------------");
//como dice el ejercicio añadimos 5 libros, peor cómo el tamaño es 4 nos dice que el catalogo esta lleno y solo imprime los 4 primeros ¡¡
        int option;
        do {
            System.out.println("""
                    1.-Busca información de un libro del catálogo por isbn.
                    2.-Construir Catalogo.
                    3.-Consulta número de libros del catálogo.
                    4.-Agregar libros al Catálogo.
                    5.-Sacar libro del Catálogo.
                    6.-Salir del menú. """);
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduce ISBN requerido : ");
            switch (option) {

                case 1:
                    System.out.println("Selecciona la biblioteca donde buscar:");
                    System.out.println("""
                            1. Biblioteca General
                            2. Biblioteca Comedia
                            3. Biblioteca Ensayo
                            4. Biblioteca Policiaca
                            5. BibliotecaTerror
                            """);

                    int opcionBiblioteca = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionBiblioteca) {
                        case 1:
                            bibliotecaGeneral.buscarLibroCatalogo();
                            break;
                        case 2:
                            bibliotecaComedia.buscarLibroCatalogo();
                            break;
                        case 3:
                            bibliotecaEnsayo.buscarLibroCatalogo();
                            break;
                        case 4:
                            bibliotecaPoliciaca.buscarLibroCatalogo();
                            break;
                        case 5:
                            bibliotecaTerror.buscarLibroCatalogo();
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Selecciona la biblioteca donde quieres construir catálogo:");
                    System.out.println("""
                            1. Biblioteca General
                            2. Biblioteca Comedia
                            3. Biblioteca Ensayo
                            4. Biblioteca Policiaca
                            5. BibliotecaTerror
                            """);

                    int opcionCatálogo = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionCatálogo) {
                        case 1:
                            bibliotecaGeneral.construirCatalogo();
                            System.out.println("Introduce el ISBN del libro que deseas agregar:");
                            String isbn = scanner.nextLine();


                            Libro libroSeleccionado = null;
                            for (Libro libro : listaLibros) {
                                if (libro.getISBN().equals(isbn)) {
                                    libroSeleccionado = libro;
                                    break;
                                }
                            }
                            if (libroSeleccionado != null) {
                                bibliotecaGeneral.agregarLibro(libroSeleccionado);
                            } else {
                                System.out.println("No se encontró ningún libro con el ISBN ingresado.");
                            }
                            break;
                        case 2:
                            bibliotecaComedia.construirCatalogo();
                            break;
                        case 3:
                            bibliotecaEnsayo.construirCatalogo();
                            break;
                        case 4:
                            bibliotecaPoliciaca.construirCatalogo();
                            break;
                        case 5:
                            bibliotecaTerror.construirCatalogo();
                            break;

                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;


                case 3:
                    System.out.println("El numero de libros de cada catálogo es : ");
                    System.out.println();
                    System.out.println("General : ");
                    bibliotecaGeneral.numeroLibrosCatalogo();
                    System.out.println("Comedia : ");
                    bibliotecaComedia.numeroLibrosCatalogo();
                    System.out.println("Ensayo : ");
                    bibliotecaEnsayo.numeroLibrosCatalogo();
                    System.out.println("Policiaca : ");
                    bibliotecaPoliciaca.numeroLibrosCatalogo();
                    System.out.println("Terror : ");
                    bibliotecaTerror.numeroLibrosCatalogo();

                    break;
                case 4:
                    do {
                        try {
                            System.out.println("Ingresa el ISBN del libro que deseas agregar:");
                            String isbn = scanner.nextLine();

                            // Buscar el libro en la lista usando el ISBN
                            Libro libroSeleccionado = null;
                            for (Libro libro : listaLibros) {
                                if (libro.getISBN().equals(isbn)) {
                                    libroSeleccionado = libro;
                                    break;
                                }
                            }

                            // Verificar si se encontró el libro
                            if (libroSeleccionado != null) {
                                System.out.println("Selecciona la biblioteca donde quieres agregar el libro:");
                                System.out.println("""
                                        1. Biblioteca General
                                        2. Biblioteca Comedia
                                        3. Biblioteca Ensayo
                                        4. Biblioteca Policiaca
                                        5. Biblioteca Terror
                                        """);

                                int opcionLibros = scanner.nextInt();
                                scanner.nextLine(); // Consumir la nueva línea después del próximo entero

                                // Agregar el libro a la biblioteca seleccionada
                                switch (opcionLibros) {
                                    case 1:
                                        bibliotecaGeneral.agregarLibro(libroSeleccionado);
                                        break;
                                    case 2:
                                        bibliotecaComedia.agregarLibro(libroSeleccionado);
                                        break;
                                    case 3:
                                        bibliotecaEnsayo.agregarLibro(libroSeleccionado);
                                        break;
                                    case 4:
                                        bibliotecaPoliciaca.agregarLibro(libroSeleccionado);
                                        break;
                                    case 5:
                                        bibliotecaTerror.agregarLibro(libroSeleccionado);
                                        break;
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }

                                System.out.println("¿Deseas agregar otro libro? (S/N)");
                                String continuar = scanner.nextLine();
                                if (!continuar.equalsIgnoreCase("S")) {
                                    break; // Salir del bucle si el usuario no desea agregar más libros
                                }
                            } else {
                                System.out.println("No se encontró ningún libro con el ISBN ingresado.");
                                break; // Salir del bucle si no se encontró el libro
                            }
                        } catch (CatalogoLlenoException e) {
                            System.out.println(e.getMessage());
                            break; // Salir del bucle si el catálogo está lleno
                        }
                    } while (true);
                    break;


                case 5:
                    System.out.println("Selecciona la biblioteca de la que deseas sacar el libro:");
                    System.out.println("""
                            1. Biblioteca General
                            2. Biblioteca Comedia
                            3. Biblioteca Ensayo
                            4. Biblioteca Policiaca
                            5. Biblioteca Terror
                            """);
                    int opcionBibliotecaSacar = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionBibliotecaSacar) {
                        case 1:
                            System.out.println("Introduce el ISBN del libro que deseas sacar del catálogo de la Biblioteca General:");
                            String isbnSacarGeneral = scanner.nextLine();
                            bibliotecaGeneral.sacarLibroDelCatalogo(isbnSacarGeneral);
                            break;
                        case 2:
                            System.out.println("Introduce el ISBN del libro que deseas sacar del catálogo de la Biblioteca General:");
                            String isbnSacarGeneral1 = scanner.nextLine();
                            bibliotecaGeneral.sacarLibroDelCatalogo(isbnSacarGeneral1);

                            break;
                        case 3:
                            System.out.println("Introduce el ISBN del libro que deseas sacar del catálogo de la Biblioteca General:");
                            String isbnSacarGeneral2 = scanner.nextLine();
                            bibliotecaGeneral.sacarLibroDelCatalogo(isbnSacarGeneral2);
                            break;
                        case 4:
                            System.out.println("Introduce el ISBN del libro que deseas sacar del catálogo de la Biblioteca General:");
                            String isbnSacarGeneral3 = scanner.nextLine();
                            bibliotecaGeneral.sacarLibroDelCatalogo(isbnSacarGeneral3);
                            break;
                        case 5:
                            System.out.println("Introduce el ISBN del libro que deseas sacar del catálogo de la Biblioteca General:");
                            String isbnSacarGeneral4 = scanner.nextLine();
                            bibliotecaGeneral.sacarLibroDelCatalogo(isbnSacarGeneral4);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;


            }
        } while (option != 6);


    }
}
