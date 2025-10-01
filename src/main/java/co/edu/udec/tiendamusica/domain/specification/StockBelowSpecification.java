/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.specification;

import co.edu.udec.tiendamusica.domain.model.Inventario;

public class StockBelowSpecification implements Specification<Inventario> {
    @Override
    public boolean isSatisfiedBy(Inventario inv) {
        return inv.necesitaReposicion();
    }
}
