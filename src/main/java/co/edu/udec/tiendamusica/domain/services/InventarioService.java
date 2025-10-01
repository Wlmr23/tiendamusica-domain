/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.services;


import co.edu.udec.tiendamusica.domain.model.Inventario;
import co.edu.udec.tiendamusica.domain.model.ObraId;
import co.edu.udec.tiendamusica.domain.specification.StockBelowSpecification;


import java.util.*;


public class InventarioService {
private final Map<ObraId, Inventario> repositorio = new HashMap<>();


public void agregarInventario(Inventario inv) { repositorio.put(inv.getObraId(), inv); }


public void registrarVenta(ObraId id, int qty) {
Inventario inv = repositorio.get(id);
if (inv == null) throw new IllegalArgumentException("inventario no encontrado");
inv.disminuir(qty);
}


public List<Inventario> obtenerAlertas() {
StockBelowSpecification spec = new StockBelowSpecification();
List<Inventario> res = new ArrayList<>();
for (var inv : repositorio.values()) {
if (spec.isSatisfiedBy(inv)) res.add(inv);
}
return res;
}


public Optional<Inventario> find(ObraId id) { return Optional.ofNullable(repositorio.get(id)); }
}
