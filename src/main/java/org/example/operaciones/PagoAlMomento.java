package org.example.operaciones;

public class PagoAlMomento implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pagando al momento: €" + cantidad);
    }
}