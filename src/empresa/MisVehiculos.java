/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author Mouad
 */
public class MisVehiculos {
    
    public static void main(String[] args) {
        // la instancia easydrive de la clase EmpresaAlquilerVehiculos
        EmpresaAlquiler easydrive = new EmpresaAlquiler("A-28-187189", "easy drive", "www.easydrive.com");
        // registro de los clientes de la empresa
        easydrive.registrarCliente(new Cliente("X5618927C", "Juan", "González López"));

        easydrive.registrarCliente(new Cliente("Z7568991Y", "Luis", "Fernández Gómez"));
        // registro de los vehículos de la empresa
        easydrive.registrarVehiculo(new Vehiculo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, false));

        easydrive.registrarVehiculo(new Vehiculo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, true));

        easydrive.registrarVehiculo(new Vehiculo("4080 TUR", "VW", "GTI", "Azul", 110.0, false));

        easydrive.registrarVehiculo(new Vehiculo("4090 TUR", "SEAT", "Ibiza", "Blanco", 90.0, false));

        easydrive.registrarVehiculo(new Vehiculo("4100 FUR", "Fiat", "Ducato", "Azul", 80.0, true));
        // imprime la relación de clientes de easydrive
        easydrive.imprimirClientes();
        // imprime el catálogo de vehículos de easydrive
        easydrive.imprimirVehiculos();
        //Rellena el array
        easydrive.rellenarCLientes();
        easydrive.rellenarVehiculos();

        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();

        System.out.println("---------------");
        //Ordeno el array
        easydrive.ordenarCliente();
        easydrive.ordenarVehiculos();

        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();

        System.out.println("----------------");
        //Busco el cliente concreto y el vehiculo concreto deseado
      //  easydrive.buscarCliente("21358003L");
      //  easydrive.buscarVehiculo("9326HLM");

        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();
        
       // nuevaEmpresa.imprimirClientes();
        System.out.println("------------------------------");
       // nuevaEmpresa.imprimirVehiculos();
        
        
        // preguntamos los datos del alquiler
        
        
        System.out.println("");
        
        
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca El nif del cliente");
        String nif= teclado.nextLine();
        
        System.out.println("Introduzca la matricula del vehiculo");
        String matricula= teclado.nextLine();
        
        teclado.nextLine(); //Limpiamos el buffer
        System.out.println("Introduzca el numero del dias del alquiler");
        int dias = teclado.nextInt();
        
    
        
        
        
    
}
}