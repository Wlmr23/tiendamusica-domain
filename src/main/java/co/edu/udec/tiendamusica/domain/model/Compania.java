/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Compania {
        private final String id;
    private final String nombre;

    public Compania(String id, String nombre) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}

