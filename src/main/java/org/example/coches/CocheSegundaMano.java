package org.example.coches;

public class CocheSegundaMano extends Coche {
    int duenosAnteriores;
    double kilometraje;


    public CocheSegundaMano(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int duenosAnteriores, double kilometraje) {
        super(idCoche, marca, modelo, precio, anoFabricacion);
        this.duenosAnteriores = duenosAnteriores;
        this.kilometraje = kilometraje;
    }
}
