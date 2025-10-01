/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import co.edu.udec.tiendamusica.domain.model.*;
import co.edu.udec.tiendamusica.domain.services.InventarioService;

public class InventarioServiceTest {
    @Test
    void registrarVentaReduceStockYAlerta() {
        var id = ObraId.generate();
        var inv = new Inventario(id, 5, 2);
        var s = new InventarioService();
        s.agregarInventario(inv);
        s.registrarVenta(id, 2);
        assertEquals(3, s.find(id).get().getCantidad());
    }

    @Test
    void registrarVentaInsuficienteDebeFallar() {
        var id = ObraId.generate();
        var inv = new Inventario(id, 1, 1);
        var s = new InventarioService();
        s.agregarInventario(inv);
        assertThrows(co.edu.udec.tiendamusica.domain.exceptions.InventarioException.class, () -> s.registrarVenta(id, 2));
    }
}