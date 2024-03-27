package org.example.coches;

import org.example.coches.tiposCoches.Electrico;

public class CocheSegundaManoElectrico extends CocheSegundaMano implements Electrico {

    double autonomiaMaxima;
    double autonomiaRestante;

    public CocheSegundaManoElectrico(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int duenosAnteriores, double autonomiaMaxima) {
        super(idCoche, marca, modelo, precio, anoFabricacion, duenosAnteriores);
        this.autonomiaMaxima = autonomiaMaxima;
        this.autonomiaRestante = autonomiaMaxima;
    }


    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria al maximo");
        this.autonomiaRestante = autonomiaMaxima;
    }

    @Override
    public double autonomiaBateria() {
        return this.autonomiaRestante;
    }
}
