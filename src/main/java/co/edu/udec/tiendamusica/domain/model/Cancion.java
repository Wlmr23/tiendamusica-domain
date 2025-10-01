/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;

/**
 *
 * @author WILMER Y ANDREA
 */
    public record Cancion(String titulo, int duracionSegundos) {
    public Cancion {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("titulo inválido");
        if (duracionSegundos <= 0) throw new IllegalArgumentException("duracion debe ser > 0");
    }
}

