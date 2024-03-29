package Proyecto_Carrera;

import java.util.Scanner;

public class Carrera {
    Scanner scanner = new Scanner(System.in);
    private Coche coche1, coche2;
    private int nVueltas;
    private double kmTotalesCircuito;
    private String campeon;

    public Carrera(Coche coche1, Coche coche2, int nVueltas, double kmTotalesCircuito) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.nVueltas = nVueltas;
        this.kmTotalesCircuito = kmTotalesCircuito;
    }

    public Carrera(int nVueltas, double kmTotalesCircuito) {
        this.nVueltas = nVueltas;
        this.kmTotalesCircuito = kmTotalesCircuito;
    }

    public Carrera() {

    }

    public void ComienzaCarrera() {
        for (int vuelta = 1; vuelta <= nVueltas; vuelta++) {
            System.out.print("\n Vuelta 🚩" + vuelta + ":");
            System.out.println();
            coche1.acelerar();
            coche2.acelerar();

            // Mostrar la información de cada coche
            System.out.println();
            System.out.println("El 🚗 1 " + coche1.getMarca() + " " + coche1.getModelo() + " Km/h, ha acelerado en total a " + coche1.getVelocidad() + " Km/h, Kilómetros recorridos: " + coche1.getKmRecorridos() + " Km");
            System.out.println("El 🚕 2 " + coche2.getMarca() + " " + coche2.getModelo() + " Km/h, ha acelerado en total a " + coche2.getVelocidad() + " Km/h, Kilómetros recorridos: " + coche2.getKmRecorridos() + " Km");

            // Comprobar si alguno de los coches ha completado la carrera
            if (coche1.getKmRecorridos() >= kmTotalesCircuito || coche2.getKmRecorridos() >= kmTotalesCircuito) {
                campeon();
                break;
            }
        }


        // Vueltas extras
        int vueltasExtra = 0;
        while (coche1.getKmRecorridos() < kmTotalesCircuito && coche2.getKmRecorridos() < kmTotalesCircuito) {
            vueltasExtra++;
            System.out.println();
            System.out.println("VUELTA EXTRA 🏴‍☠️" + vueltasExtra);

            coche1.acelerar();
            coche2.acelerar();

            System.out.println();
            System.out.println("Coche 1 🚗" + coche1.getModelo() +  " Km/h, ha acelerado en total a " + coche1.getVelocidad() + " Km/h, Kilómetros recorridos: " + coche1.getKmRecorridos() + " Km");
            System.out.println("Coche 2 🚕" + coche2.getModelo() +  " Km/h, ha acelerado en total a " + coche2.getVelocidad() + " Km/h, Kilómetros recorridos: " + coche2.getKmRecorridos() + " Km");

            if (coche1.getKmRecorridos() >= kmTotalesCircuito || coche2.getKmRecorridos() >= kmTotalesCircuito) {
                campeon();
                break;
            }
        }
    }

    public void campeon() {
        if (coche1.getKmRecorridos() >= kmTotalesCircuito) {
            campeon = coche1.getModelo();
            System.out.println("\nEl Campeón es el 🚗" + campeon + " y recorrió 350 km, donde finalizó el GP de Mónaco 🏁🥇🏆🏆🥇🏁");
        } else if (coche2.getKmRecorridos() >= kmTotalesCircuito) {
            campeon = coche2.getModelo();
            System.out.println("\nEl Campeón es el 🚕" + campeon + " y recorrió 350 km, donde finalizó el GP de Mónaco 🏁🥇🏆🏆🥇🏁");
        }

    }

    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public double getKmtotales() {
        return kmTotalesCircuito;
    }

    public void setKmtotales(double kmTotalesCircuito) {
        this.kmTotalesCircuito = kmTotalesCircuito;
    }

    public int getNVueltas() {
        return nVueltas;
    }

    public void setNVueltas(int nVueltas) {
        this.nVueltas = nVueltas;
    }

    public String getCampeon() {
        return campeon;
    }

    public void setCampeon(String campeon) {
        this.campeon = campeon;
    }
}
