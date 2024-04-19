
import controller_biblioteca.Biblioteca;
import model_biblioteca.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> listaLibros = new ArrayList<>();

        Biblioteca bibliotecaGeneral = new Biblioteca("All books", "Eduardo Afán");
        Biblioteca bibliotecaComedia = new Biblioteca("Groucho Marx", "Eduardo Afán");
        Biblioteca bibliotecaEnsayo = new Biblioteca("Michel de Montaigne", "Eduardo Afán");
        Biblioteca bibliotecaPoliciaca = new Biblioteca("Agatha Christie", "Eduardo Afán");
        Biblioteca bibliotecaTerror = new Biblioteca("Stephen King", "Eduardo Afán");

//Contruimos el catalogo de 4 libros cómo dice el ejercicio

        bibliotecaGeneral.construirCatalogo(4);


        Terror libroTerror1 = new Terror("El Resplandor", "Stephen King", 512, "1234T", "Mayor 18 años");
        Terror libroTerror2 = new Terror("IT", "Stephen King", 1138, "5678T", "Mayor 18 años");
        Terror libroTerror3 = new Terror("El Exorcista", "William Peter Blatty", 385, "9012T", "Mayor 18 años");
        Terror libroTerror4 = new Terror("Carrie", "Stephen King", 253, "3456T", "Mayor 18 años");
        Terror libroTerror5 = new Terror("La Casa de los Espíritus", "Isabel Allende", 433, "7890T", "Mayor 18 años");
        Comedia libroComedia1 = new Comedia("En nombre del viento", "Patrick Rothfuss", 662, "2345C", "Irónico");
        Comedia libroComedia2 = new Comedia("El asombroso viaje de Pomponio Flato", "Eduardo Mendoza", 240, "2345C", "Absurdo");
        Comedia libroComedia3 = new Comedia("Los hombres que no amaban a las mujeres", "Stieg Larsson", 654, "4567C", "Negro");
        Comedia libroComedia4 = new Comedia("Los hombres que no amaban a las mujeres", "Stieg Larsson", 654, "4567C", "Negro");
        Comedia libroComedia5 = new Comedia("La conjura de los necios", "John Kennedy Toole", 394, "8901C", "Satírico");
        Policiaca libroPoliciaca1 = new Policiaca("Confinado", "Federico Gatti", 320, "4567P",
                "Espacio confinado", new String[]{"Detective John Smith", "Inspector Julia Johnson", "Sospechoso Richard Black"});
        Policiaca libroPoliciaca2 = new Policiaca("El Silencio de los Corderos", "Thomas Harris", 368, "1234P",
                "Asesinato en serie", new String[]{"Psicópata asesino: Hannibal Lecter, Agente del FBI: Clarice Starling, Víctima: Buffalo Bill"});
        Policiaca libroPoliciaca3 = new Policiaca("El Misterio de la Cripta Embrujada", "Eduardo Mendoza", 240, "2345P",
                "Investigación", new String[]{"Extraterrestre: Gurb, Escritor de Novelas Policiacas: David Giró, Padre de Gurb: Don Rosendo"});
        Policiaca libroPoliciaca4 = new Policiaca("Muerte en el Nilo", "Agatha Christie", 320, "3456P",
                "Crimen a bordo", new String[]{"Detective Privado: Hércules Poirot, Socialite: Linnet Ridgeway, Enamorada Obsesiva: Jacqueline de Bellefort"});
        Policiaca libroPoliciaca5 = new Policiaca("El Halcón Maltés", "Dashiell Hammett", 224, "5678P",
                "Busqueda objeto valioso", new String[]{"Detective Privado Cínico: Sam Spade, Mujer Fatal: Brigid O'Shaughnessy, Estafador: Joel Cairo"});
        Ensayo libroEnsayo1 = new Ensayo("Ensayo sobre el entendimiento humano", "John Locke", 300, "6767E");
        Ensayo libroEnsayo2 = new Ensayo("Crítica de la razón pura", "Immanuel Kant", 400, "1234E");
        Ensayo libroEnsayo3 = new Ensayo("La riqueza de las naciones", "Adam Smith", 700, "5678E");
        Ensayo libroEnsayo4 = new Ensayo("El contrato social", "Jean-Jacques Rousseau", 350, "9012E");
        Ensayo libroEnsayo5 = new Ensayo("Sobre la libertad", "John Stuart Mill", 250, "3456E");

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


        bibliotecaGeneral.agregarLibro(libroComedia1);
        bibliotecaGeneral.agregarLibro(libroTerror1);
        bibliotecaGeneral.agregarLibro(libroPoliciaca1);
        bibliotecaGeneral.agregarLibro(libroEnsayo1);
        bibliotecaGeneral.agregarLibro(libroComedia2);
        System.out.println("Libros en el catálogo de la biblioteca general:");
        bibliotecaGeneral.mostrarLibrosEnCatalogo();
        System.out.println("Lista de libros disponibles:");
        for (Libro libro : listaLibros) {
            System.out.println(libro.getTitulo() + " " + libro.getISBN());
        }
//como dice el ejercicio añadimos 5 libros, peor cómo el tamaño es 4 nos dice que el catalogo esta lleno y solo imprime los 4 primeros ¡¡
        do {
            System.out.println("""
                    1.-Busca información de un libro del catálogo por isbn.
                    2.-Construir Catalogo.
                    3.-Consulta número de libros del catálogo.
                    4.-Agregar libros al Catálogo.
                    5.-Sacar libro del Catálogo.
                    6.-Salir del menú. """);

            int option = scanner.nextInt();
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
                    int opcionLibros= scanner.nextInt();
                    // Verificar si se encontró el libro
                    if (libroSeleccionado != null) {
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
                    } else {
                        System.out.println("No se encontró ningún libro con el ISBN ingresado.");
                    }
                    break;

                break;
                case 5:
                    break;
                case 6:
                    break;

            }

        }


        while (!option == 6);

    }
}
