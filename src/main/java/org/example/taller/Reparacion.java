package org.example.taller;

import org.example.coches.Coche;
import org.example.personas.Cliente;
import org.example.personas.Empleado;
import org.example.personas.Mecanico;
import org.example.personas.Vendedor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Reparacion {

    private Coche cocheReparado;
    private Cliente cliente;

    private Empleado mecanico;

    private double precioReparacion;

    private LocalDate fechaVenta;

    private String concepto;

    private Map<Pieza, Double> piezasReparadas;

    public Reparacion(Coche cocheReparado, Cliente cliente, Empleado mecanico, double precioReparacion, LocalDate fechaVenta) {
        this.cocheReparado = cocheReparado;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.precioReparacion = precioReparacion;
        this.fechaVenta = fechaVenta;
        this.concepto = "REPARACION";
        this.piezasReparadas = new HashMap<>();
    }
}
