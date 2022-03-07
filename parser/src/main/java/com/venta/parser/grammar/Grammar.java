package com.venta.parser.grammar;

import lombok.Value;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

@Value
public class Grammar {
    List<Rule> rules;

    public boolean hasRules() {
        return CollectionUtils.isNotEmpty(rules);
    }
}
