package br.ufc.rulesengine.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.ufc.rulesengine.rules.AbstractRule;

public class Analyzer2 {

	public Map<AbstractRule<? extends Object>, Boolean> apply(
			Set<AbstractRule<? extends Object>> regras,
			Map<String, Object> context) {

		HashMap<AbstractRule<?>, Boolean> result = new HashMap<AbstractRule<?>, Boolean>();

		for (AbstractRule<? extends Object> regra : regras) {

			result.put(regra, regra.apply(context));
		}

		return result;
	}
}
