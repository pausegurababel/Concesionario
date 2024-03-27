package org.example.coches;

import org.example.coches.tiposCoches.Combustion;

public class CocheSegundaManoCombustion extends CocheSegundaMano implements Combustion {
    double combustibleMaximo;
    double combustibleActual;
    public CocheSegundaManoCombustion(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int duenosAnteriores, double kilometraje, double combustibleMaximo) {
        super(idCoche, marca, modelo, precio, anoFabricacion, duenosAnteriores, kilometraje);
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
