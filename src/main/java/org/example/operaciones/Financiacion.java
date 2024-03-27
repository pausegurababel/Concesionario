package org.example.operaciones;

public class Financiacion implements MetodoPago {

    private int plazoEnMeses;
    private double tasaInteresAnual;

    public Financiacion(int plazoEnMeses, double tasaInteresAnual) {
        this.plazoEnMeses = plazoEnMeses;
        this.tasaInteresAnual = tasaInteresAnual;
    }
    public void procesarPago(double cantidad) {
        double cantidadFinal = cantidad + (cantidad * (tasaInteresAnual / 100) * (plazoEnMeses / 12.0));
        System.out.println("Financiando: €" + cantidad + ". Monto final después de intereses: €" + cantidadFinal);
    }
}