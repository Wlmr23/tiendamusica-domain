/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.factory;


import co.edu.udec.tiendamusica.domain.model.*;
import co.edu.udec.tiendamusica.domain.enums.*;
import co.edu.udec.tiendamusica.domain.valueobjects.Precio;

import java.util.List;

public class ObraFactory {
    public static Obra crearCD(String titulo, Genero genero, Precio precio, List<Cancion> pistas) {
        return new Obra(ObraId.generate(), titulo, TipoObra.CD, genero, precio, pistas);
    }

    public static Obra crearColeccion(String titulo, Precio precio) {
        return new Obra(ObraId.generate(), titulo, TipoObra.COLECCION, Genero.OTRO, precio, List.of());
    }
}
