package org.example.coches;

import org.example.coches.tiposCoches.Electrico;

public class CocheNuevoElectrico  extends CocheNuevo implements Electrico {
    double autonomiaMaxima;
    double autonomiaRestante;
    public CocheNuevoElectrico(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int garantia, double autonomiaMaxima) {
        super(idCoche, marca, modelo, precio, anoFabricacion, garantia);
        this.autonomiaMaxima = autonomiaMaxima;
        this.autonomiaRestante = autonomiaMaxima;
    }

    @Override
    public void cargarBateria() {
        System.out.println("Bateria recargada");
        this.autonomiaRestante = this.autonomiaMaxima;

    }

    @Override
    public double autonomiaBateria() {
        return this.autonomiaRestante;
    }
}
