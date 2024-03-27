package org.example.operaciones;

import org.example.coches.Coche;
import org.example.personas.Cliente;
import org.example.personas.Empleado;

import java.time.LocalDate;

public class Venta extends Operacion {
    private Coche cocheVendido;
    private Cliente cliente;
    private Empleado vendedor;
    private double precioVenta;
    private LocalDate fechaVenta;
    private MetodoPago metodoPago;

    private String concepto;

    public Venta(Coche cocheVendido, Cliente cliente, Empleado vendedor, double precioVenta, LocalDate fechaVenta, MetodoPago metodoPago) {
        this.cocheVendido = cocheVendido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.metodoPago = metodoPago;
        this.concepto = "VENTA";
    }

    public void procesarVenta() {
        metodoPago.procesarPago(this.precioVenta);
    }

}

