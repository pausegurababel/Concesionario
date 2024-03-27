package org.example.personas;

public class Mecanico extends Empleado {

    public Mecanico(String idEmpleado, String nombre, String dni) {
        super(idEmpleado, nombre, dni);
    }

    @Override
    public void realizarTarea() {
        System.out.println("Reparando...");
    }
}
