/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;

import java.util.UUID;
/**
 *
 * @author WILMER Y ANDREA
 */
public record ObraId(UUID value) {
    public ObraId {
        if (value == null) throw new IllegalArgumentException("id no puede ser nulo");
    }
    public static ObraId generate() { return new ObraId(UUID.randomUUID()); }
}

