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
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private String nif;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Cliente(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return nif + " " + apellidos + " " + nombre;
    }

    public static Cliente ClienteAleatorio() {
        Random random = new Random();

        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Pepe");
        nombre.add("Alvaro");
        nombre.add("Rosa");
        nombre.add("Raul");
        nombre.add("Juan");
        nombre.add("Dani");
        nombre.add("Salva");
        nombre.add("Fernando");
        nombre.add("Javi");

        ArrayList<String> apellido = new ArrayList<>();
        apellido.add("Lopez");
        apellido.add("Gomez");
        apellido.add("Morata");
        apellido.add("Villa");
        apellido.add("Lopez");
        apellido.add("Ramos");
        apellido.add("Carvajal");
        apellido.add("Tortosa");
        apellido.add("Angeles");
        apellido.add("Casillas");
        
        ArrayList<String> nif = new ArrayList<>();
        nif.add("k3569874m");
        nif.add("m3456972n");
        nif.add("u4566932o");
        nif.add("v4566923p");
        nif.add("o9754542v");
        nif.add("w6467441c");
        nif.add("z4546643u");
        nif.add("a1467963b");
        nif.add("y4645633g");
        nif.add("t5642446l");    
        
        String nombreAle = nombre.get(random.nextInt(nombre.size()));
        System.out.println("Nombre: " + nombreAle);
        String apellidoAle = apellido.get(random.nextInt(apellido.size()));
        System.out.println("Apellido: " + apellidoAle);
        String nifAle = nif.get(random.nextInt(nif.size()));
        System.out.println("Nif :" + nifAle);
        Cliente cliente = new Cliente(nifAle, nombreAle, apellidoAle);
        return cliente;
    }
        public static void main(String[] args) {
        Cliente.ClienteAleatorio();
}
}