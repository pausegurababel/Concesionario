package org.example.concesionario;

import org.example.personas.Cliente;

import java.time.LocalDateTime;

public class Visita {
    private Cliente cliente;
    private LocalDateTime fechaHora;
    private String proposito;
    private String notas;

    public Visita(Cliente cliente, LocalDateTime fechaHora, String proposito, String notas) {
        this.cliente = cliente;
        this.fechaHora = fechaHora;
        this.proposito = proposito;
        this.notas = notas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void imprimirDetalles() {
        System.out.println("Visita de Cliente: " + cliente.getNombre());
        System.out.println("Fecha/Hora: " + fechaHora.toString());
        System.out.println("Propósito: " + proposito);
        System.out.println("Notas: " + notas);
    }
}
