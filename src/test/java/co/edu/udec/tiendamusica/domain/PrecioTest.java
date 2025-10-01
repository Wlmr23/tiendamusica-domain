/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import co.edu.udec.tiendamusica.domain.valueobjects.Precio;
import java.math.BigDecimal;

public class PrecioTest {
    @Test
    void debeCrearPrecioValido() {
        var p = new Precio(BigDecimal.valueOf(45.5));
        assertEquals(BigDecimal.valueOf(45.5), p.value());
    }

    @Test
    void debeFallarConValorNulo() {
        assertThrows(IllegalArgumentException.class, () -> new Precio(null));
    }
}