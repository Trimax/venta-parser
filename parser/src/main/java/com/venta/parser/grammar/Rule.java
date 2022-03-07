package com.venta.parser.grammar;

import com.venta.parser.grammar.expressions.Expression;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Rule {
    String definition;
    Expression expression;
}
