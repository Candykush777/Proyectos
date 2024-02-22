package Proyecto_Carrera;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coche coche1 = new Coche("Ferrari", "Testarossa", "JDW6996", 835, 4500);
        Coche coche2 = new Coche("Porsche", "CarreraGT", "3773FXF", 775, 4200);

        System.out.println("Datos de ambos participantes");
        System.out.println();
        System.out.println("Datos primer coche : ");
        System.out.println("--------------------");
        coche1.mostrardato();
        System.out.println("Datos segundo coche : ");
        System.out.println("--------------------");
        coche2.mostrardato();
        System.out.println("Comienza la carrera GP de Mónaco: ");
        Carrera GPMónaco = new Carrera(coche1, coche2, 10, 350);
        System.out.println("------------------------------------");

        GPMónaco.ComienzaCarrera();
    }

}
