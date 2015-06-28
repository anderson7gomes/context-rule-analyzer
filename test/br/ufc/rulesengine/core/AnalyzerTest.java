package br.ufc.rulesengine.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import br.ufc.rulesengine.rules.AbstractRule;
import br.ufc.rulesengine.rules.NotRule;
import br.ufc.rulesengine.rules.NotRule.ParameterName;

@RunWith(JUnit4.class)
public class AnalyzerTest {

	@Test
	public void seRulesVazioEntaoAnalyzerReturnMapVazio() {

		// TODO: estudar generics
		final Set<AbstractRule<? extends Object>> regras = new HashSet<AbstractRule<? extends Object>>();
		final Map<String, Object> context = new HashMap<String, Object>();

		final Map<AbstractRule<? extends Object>, Boolean> result = new Analyzer2()
				.apply(regras, context);

		assertTrue(result.isEmpty());
	}

	@Test
	public void seRulesContainsNotRuleAndContextContainsTrueEntaoReturnMapComFalse() {

		final Boolean value = Boolean.TRUE;
		final Set<AbstractRule<? extends Object>> regras = new HashSet<AbstractRule<? extends Object>>();
		final AbstractRule<? extends Object> regra = new NotRule()
				.addParameter(ParameterName.VALUE, Boolean.class);
		regras.add(regra);
		final Map<String, Object> context = new HashMap<String, Object>();
		context.put(ParameterName.VALUE.toString(), value);

		final Map<AbstractRule<? extends Object>, Boolean> result = new Analyzer2()
				.apply(regras, context);

		assertFalse(result.isEmpty());

		Boolean regraResult = result.get(regra);

		assertFalse(regraResult);
	}
}
