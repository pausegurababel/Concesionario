package org.example.inventario;

import org.example.coches.Coche;

import java.util.HashMap;
import java.util.Map;

public class InventarioCoches {

    private Map<String, Coche> mapaCoches;

    public InventarioCoches() {
        this.mapaCoches = new HashMap<>();
    }

    public Map<String, Coche> getMapaCoches() {
        return mapaCoches;
    }
}
