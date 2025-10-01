/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;
import co.edu.udec.tiendamusica.domain.valueobjects.Precio;
import co.edu.udec.tiendamusica.domain.enums.Genero;
import co.edu.udec.tiendamusica.domain.enums.TipoObra;
import co.edu.udec.tiendamusica.domain.exceptions.ObraException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author WILMER Y ANDREA
 */
public class Obra {
        private final ObraId id;
    private String titulo;
    private TipoObra tipo;
    private Genero genero;
    private Precio precio;
    private final List<Cancion> pistas;

    public Obra(ObraId id, String titulo, TipoObra tipo, Genero genero, Precio precio, List<Cancion> pistas) {
        if (id == null) throw new ObraException("id no puede ser nulo");
        if (titulo == null || titulo.isBlank()) throw new ObraException("titulo inválido");
        if (tipo == null) throw new ObraException("tipo inválido");
        if (precio == null) throw new ObraException("precio inválido");
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.genero = genero == null ? Genero.OTRO : genero;
        this.precio = precio;
        this.pistas = pistas == null ? new ArrayList<>() : new ArrayList<>(pistas);
    }

    public void agregarCancion(Cancion c) {
        if (c == null) throw new ObraException("cancion inválida");
        this.pistas.add(c);
    }

    public ObraId getId() { return id; }
    public String getTitulo() { return titulo; }
    public TipoObra getTipo() { return tipo; }
    public Genero getGenero() { return genero; }
    public Precio getPrecio() { return precio; }
    public List<Cancion> getPistas() { return List.copyOf(pistas); }
}

