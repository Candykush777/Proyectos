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


    public void acelerar() {
        System.out.println("Cuanto quieres acelerar : ");
        if (velocidad < 10) {
            velocidad = 10;
        }
        int acelerar= scanner.nextInt();
        if (cv>100) {
            velocidad += (Math.random() * acelerar) + 10;
        }else{
            velocidad+=Math.random()*acelerar;
        }
        kmRecorridos=velocidad*0.5;




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
