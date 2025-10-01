/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;
import java.time.LocalDate;
/**
 *
 * @author WILMER Y ANDREA
 */
public class Edicion {
        private final String id;
    private final ObraId obraId;
    private final Compania compania;
    private final LocalDate fecha;

    public Edicion(String id, ObraId obraId, Compania compania, LocalDate fecha) {
        if (id==null || id.isBlank()) throw new IllegalArgumentException("id inválido");
        if (obraId==null) throw new IllegalArgumentException("obraId inválido");
        if (compania==null) throw new IllegalArgumentException("compania inválida");
        if (fecha==null) throw new IllegalArgumentException("fecha inválida");
        this.id=id;this.obraId=obraId;this.compania=compania;this.fecha=fecha;
    }

    public String getId(){return id;}
    public ObraId getObraId(){return obraId;}
    public Compania getCompania(){return compania;}
    public LocalDate getFecha(){return fecha;}
}
