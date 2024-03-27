package org.example.personas;

public abstract class Empleado {

    protected String idEmpleado;
    protected String nombre;

    protected String dni;

    public Empleado(String idEmpleado, String nombre, String dni) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract void realizarTarea();
}
