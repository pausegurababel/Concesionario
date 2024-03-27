package org.example.personas;


public class Vendedor extends Empleado {


    public Vendedor(String idEmpleado, String nombre, String dni) {
        super(idEmpleado, nombre, dni);
    }

    @Override
    public void realizarTarea() {
        System.out.println("Vendiendo el coche");
    }
}
