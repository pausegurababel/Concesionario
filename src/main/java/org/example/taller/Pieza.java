package org.example.taller;

public abstract class Pieza {
    protected String idPieza;
    protected String nombre;

    protected int cantidad;

    public Pieza(String idPieza, String nombre, int cantidad) {
        this.idPieza = idPieza;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(String idPieza) {
        this.idPieza = idPieza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
