import com.venta.parser.GrammarFactory;
import com.venta.parser.ParserFactory;
import com.venta.parser.grammar.Grammar;
import com.venta.parser.grammar.Parser;
import com.venta.parser.grammar.Rule;
import com.venta.parser.grammar.expressions.Number;
import com.venta.parser.grammar.expressions.Transformation;
import com.venta.parser.tree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GrammarFactoryTest {
    @Test
    void test() {
        final Grammar grammar = GrammarFactory.withRule(new Rule("EXPRESSION", new Number())).build();

        assertTrue(grammar.hasRules(), "Parsed grammar must have rules");
    }

    @Test
    void testComplex() {
        final Parser parser = ParserFactory.build(GrammarFactory
                .withRule(new Rule("EXPRESSION", new Number()))
                .withRule(new Rule("EXPRESSION", new Transformation("EXPRESSION + EXPRESSION")))
                .build());

        final Node node = parser.parse("4.1 + 1.2 + 2.3");
        assertNotNull(node, "Parsed expression must not be null");
    }
}
