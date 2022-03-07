package com.venta.parser;

import com.venta.parser.tree.Node;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ComputeFactory {
    public static ComputeFactory.ComputeBuilder withVariable(final String name, final BigDecimal value) {
        return new ComputeFactory.ComputeBuilder().withVariable(name, value);
    }

    public static BigDecimal compute(final Node tree) {
        return new ComputeBuilder().compute(tree);
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ComputeBuilder {
        private final Map<String, BigDecimal> values = new HashMap<>();

        public ComputeFactory.ComputeBuilder withVariable(final String name, final BigDecimal value) {
            values.put(name, value);
            return this;
        }

        public BigDecimal compute(final Node tree) {
            return BigDecimal.ZERO;
        }
    }
}
