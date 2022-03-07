package com.venta.parser.grammar;

import com.venta.parser.tree.Node;
import lombok.Value;

@Value
public class Parser {
    public Node parse(final String expression) {
        return new Node();
    }
}
