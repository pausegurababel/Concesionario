package org.example.coches;

import org.example.coches.tiposCoches.Combustion;

public class CocheNuevoCombustion extends CocheNuevo implements Combustion {
    double combustibleMaximo;
    double combustibleActual;
    public CocheNuevoCombustion(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int garantia, double combustibleMaximo) {
        super(idCoche, marca, modelo, precio, anoFabricacion, garantia);
        this.combustibleMaximo = combustibleMaximo;
        this.combustibleActual = combustibleMaximo;
    }

    @Override
    public void recargarTanque() {
        System.out.println("Reapostado al máximo");
        this.combustibleActual = combustibleMaximo;

    }

    @Override
    public double ombustible() {
        return this.combustibleActual;
    }
}
