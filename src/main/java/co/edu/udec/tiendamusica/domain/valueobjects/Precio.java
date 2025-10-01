/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.tiendamusica.domain.valueobjects;
import java.math.BigDecimal;

public record Precio(BigDecimal value) {
    public Precio {
        if (value == null) throw new IllegalArgumentException("Precio no puede ser nulo");
        if (value.signum() < 0) throw new IllegalArgumentException("Precio no puede ser negativo");
    }

    public static Precio of(double amount) {
        return new Precio(BigDecimal.valueOf(amount));
    }

    @Override
    public String toString() {
        return value.toPlainString();
    }
}