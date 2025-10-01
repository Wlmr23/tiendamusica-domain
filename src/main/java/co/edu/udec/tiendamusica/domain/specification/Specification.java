/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.specification;

/**
 *
 * @author WILMER Y ANDREA
 */
public interface Specification<T> {
    boolean isSatisfiedBy(T t);
}
