package br.ufc.rulesengine.test;

import java.util.List;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.Rule;

public class RulesList {

	List<Rule> rules;
	
	public RulesList(List<Rule> rules) {
		
		this.rules = rules;

	} // end method RulesList
	
	public void applyRules(Context context) {
		
		for (Rule rule : rules) {
			rule.apply(context);
		}
		
	} // end method applyRules
	
} // end class RulesList