import controller_biblioteca.Biblioteca;
import controller_biblioteca.Biblioteca.Catalogo;
import controller_biblioteca.BibliotecaGeneral;
import model_biblioteca.Comedia;
import model_biblioteca.Ensayo;
import model_biblioteca.Policiaca;
import model_biblioteca.Terror;
import model_biblioteca.Libro;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Los ISBN son ficticios , el formato común es diferente, pero necesito sencillez.
        BibliotecaGeneral biblioteca = new BibliotecaGeneral("Biblioteca alfa", "Eduardo Afán");
        // Crear un catálogo con un tamaño especificado por el usuario
        System.out.println("Vamos a dejar creado el Catalogo, para luego en el menu usar sus funcionalidades ");
        System.out.println("Introduce el tamaño del catálogo:");
        int tamanoCatalogo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea en el búfer del scanner
        Catalogo catalogo = biblioteca.new Catalogo(tamanoCatalogo);
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


        //Meter todos los libros en la Biblioteca general

        biblioteca.agregarLibroBiblioteca(libroComedia1);
        biblioteca.agregarLibroBiblioteca(libroComedia2);
        biblioteca.agregarLibroBiblioteca(libroComedia3);
        biblioteca.agregarLibroBiblioteca(libroComedia4);
        biblioteca.agregarLibroBiblioteca(libroComedia5);
        biblioteca.agregarLibroBiblioteca(libroEnsayo1);
        biblioteca.agregarLibroBiblioteca(libroEnsayo2);
        biblioteca.agregarLibroBiblioteca(libroEnsayo3);
        biblioteca.agregarLibroBiblioteca(libroEnsayo4);
        biblioteca.agregarLibroBiblioteca(libroEnsayo5);
        biblioteca.agregarLibroBiblioteca(libroPoliciaca1);
        biblioteca.agregarLibroBiblioteca(libroPoliciaca2);
        biblioteca.agregarLibroBiblioteca(libroPoliciaca3);
        biblioteca.agregarLibroBiblioteca(libroPoliciaca4);
        biblioteca.agregarLibroBiblioteca(libroPoliciaca5);
        biblioteca.agregarLibroBiblioteca(libroTerror1);
        biblioteca.agregarLibroBiblioteca(libroTerror2);
        biblioteca.agregarLibroBiblioteca(libroTerror3);
        biblioteca.agregarLibroBiblioteca(libroTerror4);
        biblioteca.agregarLibroBiblioteca(libroTerror5);





        /*Aqui estaba probando si imprimia lso libros de la biblioteca , System.out.println("Lista de libros en la Biblioteca:");
        System.out.println(Biblioteca.getCatalogo().toString());*/
//Vamos hacer el menu de la Biblioteca

        do {
            System.out.println("""
                    1.-Buscar informacion del libro por ISBN en Biblioteca.
                    2.-Construir Catalogo y buscar información del libro del Catalogo.
                    3.-Agrega 5 libros al catálogo.
                    4.-Mostrar los libros del Catálogo.
                    5.-Agregar libros al cualquier Catálogo.
                    6.-Sacar libro del Catálogo.
                    7.-Salir """);

            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduce ISBN requerido : ");
            switch (option) {

                case 1:
                    biblioteca.buscarLibroPorISBNBiblioteca(scanner.nextLine());
                    break;
                case 2:

                    // Verificar si el catálogo ya ha sido construido




            }

        }


        while ();

    }
}
