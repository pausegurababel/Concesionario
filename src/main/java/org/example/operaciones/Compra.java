package org.example.operaciones;

import org.example.coches.Coche;
import org.example.personas.Cliente;

import java.time.LocalDate;

public class Compra extends Operacion {
    private Coche cocheComprado;
    private Cliente vendedor;
    private double precioCompra;
    private LocalDate fechaCompra;
    private String concepto;

    public Compra(Coche cocheComprado, Cliente vendedor, double precioCompra, LocalDate fechaCompra) {
        this.cocheComprado = cocheComprado;
        this.vendedor = vendedor;
        this.precioCompra = precioCompra;
        this.fechaCompra = fechaCompra;
        this.concepto = "COMPRA";
    }

    public void procesarCompra() {
        System.out.println("Compra procesada para el coche: " + cocheComprado.getModelo() + " del vendedor: " + vendedor.getNombre() + " por $" + precioCompra);
    }

}