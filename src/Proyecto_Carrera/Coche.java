package Proyecto_Carrera;

import java.util.Scanner;

public class Coche {
    Scanner scanner = new Scanner(System.in);
    private String marca, modelo, matrícula;
    private int velocidad, cv, cc;
    private double kmRecorridos;

    public Coche() {

    }

    public Coche(String marca, String modelo, String matrícula, int velocidad, int cv, int cc) {

        this.marca = marca;
        this.modelo = modelo;
        this.matrícula = matrícula;
        this.velocidad = velocidad;
        this.cv = cv;
        this.cc = cc;


    }


    public Coche(String marca, String modelo, String matrícula, int cv, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.matrícula = matrícula;
        this.cv = cv;
        this.cc = cc;
    }



    //No se si hace falta esto, me estoy liando
    public void mostrardato() {


        System.out.println("Marca : " + marca);
        System.out.println("Modelo : " + modelo);
        System.out.println("Matrícula : " + matrícula);
        System.out.println("Cv : " + cv);
        System.out.println("Centímetros Cúbicos : " + cc);
        System.out.println();


    }


    public void acelerar(int velocidadInicial) {
        // Calcular la aceleración internamente
        int aceleracion = calcularAceleracion(velocidadInicial);

        // Sumamos la velocidad inicial con la aceleración calculada
        int velocidadTotal = velocidadInicial + aceleracion;

        // Calculamos los kilómetros recorridos con la velocidad total
        double incrementoKm = 0.5 * velocidadTotal;
        kmRecorridos += incrementoKm;

        // Actualizamos la velocidad del coche con la velocidad total
        velocidad = Math.max(velocidadTotal, 10);
    }


    private int calcularAceleracion(int aceleracion) {
        if (cv < 100) {
            return (int) (Math.random() * aceleracion + 1);
        } else {
            return 10 + (int) (Math.random() * aceleracion - 9);
        }
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getKm() {
        return kmRecorridos;
    }

    public int getCv() {
        return cv;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
