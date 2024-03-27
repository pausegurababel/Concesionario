package org.example.inventario;

import org.example.coches.Coche;
import org.example.taller.Pieza;

import java.util.HashMap;
import java.util.Map;

public class InventarioPiezas {

    private Map<String, Pieza> mapaPiezas;

    public InventarioPiezas() {
        this.mapaPiezas= new HashMap<>();
    }

    public Map<String, Pieza> getMapaPiezas() {
        return mapaPiezas;
    }


}
