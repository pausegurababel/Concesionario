package org.example.coches;

public abstract class Coche {


protected String idCoche;
protected String marca;

protected String modelo;

protected double precio;

protected int anoFabricacion;

protected boolean arrancado;

    public Coche(String idCoche, String marca, String modelo, double precio, int anoFabricacion) {
        this.idCoche = idCoche;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.anoFabricacion = anoFabricacion;
        this.arrancado = false;
    }

    public void arrancar(){
        System.out.println("Coche arrancado");
        this.arrancado = true;

    }
    public void recorrerCalle(){
        if (!this.arrancado){
            System.out.println("Arranca el coche!!");
        }else{
            System.out.println("Circulando por la calle");
        }


    }
    public void girar(){
        if (!this.arrancado){
            System.out.println("Arranca el coche!!");
        }else{
            System.out.println("Girando");
        }
    }

    public String getModelo() {
        return modelo;
    }
}
