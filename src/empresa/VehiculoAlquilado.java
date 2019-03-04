/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.time.Month;

/**
 *
 * @author Mouad
 */
public class VehiculoAlquilado {

    private Vehiculo vehiculo;
    private Cliente cliente;
    private int diaAlquiler;
    private Month mesAlquiler;
    private int AñoAlquiler;
    private int TotalDiasAlquiler;

    public VehiculoAlquilado(Vehiculo vehiculo, Cliente cliente, int diaAlquiler, Month mesAlquiler, int AñoAlquiler, int TotalDiasAlquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.AñoAlquiler = AñoAlquiler;
        this.TotalDiasAlquiler = TotalDiasAlquiler;

    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public Month getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(Month mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAñoAlquiler() {
        return AñoAlquiler;
    }

    public void setAñoAlquiler(int AñoAlquiler) {
        this.AñoAlquiler = AñoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return TotalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int TotalDiasAlquiler) {
        this.TotalDiasAlquiler = TotalDiasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", A\u00f1oAlquiler=" + AñoAlquiler + ", TotalDiasAlquiler=" + TotalDiasAlquiler + '}';
    }

}
