/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author Mouad
 */
public class EmpresaAlquiler {

    private String cif;
    private String nombre;
    private int totalClientes;

    public EmpresaAlquiler(String cif, String nombre, int totalClientes, ArrayList<Cliente> clientes, int totalVehiculos, ArrayList<Vehiculo> vehiculos, int totalAlquileres, ArrayList<VehiculoAlquilado> alquileres) {
        this.cif = cif;
        this.nombre = nombre;
        this.totalClientes = totalClientes;
        this.clientes = clientes;
        this.totalVehiculos = totalVehiculos;
        this.vehiculos = vehiculos;
        this.totalAlquileres = totalAlquileres;
        this.alquileres = alquileres;
    }
    private ArrayList<Cliente> clientes;
    private int totalVehiculos;
    private ArrayList<Vehiculo> vehiculos;
    private int totalAlquileres;
    private ArrayList<VehiculoAlquilado> alquileres;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public ArrayList<VehiculoAlquilado> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<VehiculoAlquilado> alquileres) {
        this.alquileres = alquileres;
    }
//registrarCliente

    public void registrarCliente(Cliente nuevo) {
        this.clientes.add(nuevo);

    }
    //registrarVehiculo   

    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos.add(nuevo);

    }

    //imprimirClientes()
    public void imprimirClientes() {
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes.get(i));
        }
    }

    //imprimirVehiculos()
    public void imprimirVehiculos() {
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos.get(i));
        }
    }

    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes.get(i).getNif().equals(nif)) {
                return this.clientes.get(i);
            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculos.get(i).getMatricula().equals(matricula)) {
                return this.vehiculos.get(i);
            }
        }

        return null;
    }
}
