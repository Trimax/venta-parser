package com.venta.parser;

import com.venta.parser.grammar.Grammar;
import com.venta.parser.grammar.Parser;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ParserFactory {
    public static Parser build(final Grammar grammar) {
        return new Parser();
    }
}
