/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mouad
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.tarifa = tarifa;
        this.disponible = disponible;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public static Vehiculo VehiculoAleatorio() {
        Random random = new Random();

        ArrayList<String> marca = new ArrayList<>();
        marca.add("Audi");
        marca.add("BMW");
        marca.add("Seat");
        marca.add("Ferrari");
        marca.add("Ford");
        marca.add("Mercedes");
        marca.add("Dacia");
        marca.add("Mini");
        marca.add("Renault");

        ArrayList<String> modelo = new ArrayList<>();
        modelo.add("A3");
        modelo.add("M5");
        modelo.add("Leon");
        modelo.add("Carrera");
        modelo.add("Fiesta");
        modelo.add("Benz");
        modelo.add("Ducker");
        modelo.add("Coper");
        modelo.add("Clio");

        boolean disponibilidad;

        if (random.nextBoolean()) {
            disponibilidad = true;
        } else {
            disponibilidad = false;
        }

        ArrayList<String> color = new ArrayList<>();
        color.add("Rojo");
        color.add("Negro");
        color.add("Blanco");
        color.add("Verde");
        color.add("Amarillo");
        color.add("Azul");
        color.add("Naranja");

        String matricula = "";
        for (int i = 0; i < 7; i++) {

            if (i < 4) {

                matricula += random.nextInt(10);
            } else {

                matricula += (char) (random.nextInt(90 - 65 + 1) + 65);
            }
        }
        double Tarifa;
        Tarifa = random.nextInt(200 - 150 + 1) + 150;

        String marcaAle = marca.get(random.nextInt(marca.size()));
        String modeloAle = modelo.get(random.nextInt(modelo.size()));
        String colorAle = color.get(random.nextInt(color.size()));
        Vehiculo vehiculo = new Vehiculo(matricula, marcaAle, modeloAle, colorAle, Tarifa, disponibilidad);
        System.out.println(vehiculo);
        return vehiculo;
    }

    public static void main(String[] args) {
        Vehiculo.VehiculoAleatorio();
    }
}
