package io.github.leandromaximo.clientes.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BigDecimalConverter {

    // 1.000,00 -> 1000.0
    public BigDecimal converter(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        value = value.replace(".", "").replace(",", ".");
        return new BigDecimal(value);
    }
}
