/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.model;
import co.edu.udec.tiendamusica.domain.exceptions.InventarioException;

/**
 *
 * @author WILMER Y ANDREA
 */
public class Inventario {

    private final ObraId obraId;
    private int cantidad;
    private final int stockMinimo;

    public Inventario(ObraId obraId, int cantidad, int stockMinimo) {
        if (obraId==null) throw new InventarioException("obraId nulo");
        if (cantidad < 0) throw new InventarioException("cantidad inválida");
        if (stockMinimo < 0) throw new InventarioException("stockMinimo inválido");
        this.obraId = obraId;
        this.cantidad = cantidad;
        this.stockMinimo = stockMinimo;
    }

    public void disminuir(int qty) {
        if (qty <= 0) throw new InventarioException("cantidad a disminuir inválida");
        if (qty > cantidad) throw new InventarioException("stock insuficiente");
        cantidad -= qty;
    }

    public void aumentar(int qty) {
        if (qty <= 0) throw new InventarioException("cantidad a aumentar inválida");
        cantidad += qty;
    }

    public boolean necesitaReposicion() { return cantidad <= stockMinimo; }
    public int getCantidad() { return cantidad; }
    public int getStockMinimo() { return stockMinimo; }
    public ObraId getObraId() { return obraId; }
}

