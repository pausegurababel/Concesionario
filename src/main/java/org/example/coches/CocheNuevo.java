package org.example.coches;

public class CocheNuevo extends Coche {
    int garantia;

    public CocheNuevo(String idCoche, String marca, String modelo, double precio, int anoFabricacion, int garantia) {
        super(idCoche, marca, modelo, precio, anoFabricacion);
        this.garantia = garantia;
    }
}
