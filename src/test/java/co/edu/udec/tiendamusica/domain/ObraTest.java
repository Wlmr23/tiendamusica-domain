/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import co.edu.udec.tiendamusica.domain.model.*;
import co.edu.udec.tiendamusica.domain.enums.Genero;

import java.util.List;

public class ObraTest {
    @Test
    void agregarCancionFunciona() {
        var obra = new Obra(ObraId.generate(), "Mi Album", co.edu.udec.tiendamusica.domain.enums.TipoObra.CD, Genero.ROCK, co.edu.udec.tiendamusica.domain.valueobjects.Precio.of(10.0), List.of());
        obra.agregarCancion(new Cancion("Track1", 180));
        assertEquals(1, obra.getPistas().size());
    }
}
