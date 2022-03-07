package com.venta.parser;

import com.venta.parser.grammar.Grammar;
import com.venta.parser.grammar.Rule;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class GrammarFactory {
    public static GrammarBuilder withRule(final Rule rule) {
        return new GrammarBuilder().withRule(rule);
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class GrammarBuilder {
        private final List<Rule> rules = new ArrayList<>();

        public GrammarBuilder withRule(final Rule rule) {
            rules.add(rule);
            return this;
        }

        public Grammar build() {
            return new Grammar(rules);
        }
    }
}
