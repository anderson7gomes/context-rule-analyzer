package br.ufc.rulesengine.test;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;
import br.ufc.rulesengine.core.Status;

public class RuleAutenticado extends BasicRule {

	public RuleAutenticado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleAutenticado
	
	@Override
	public Status apply(Context context) {
		
		Boolean autenticado = (Boolean) context.getProperty("Autenticado");
		
		return (autenticado) ? Status.GOOD : Status.BAD;
		
 	} // end method apply
	
} // end class RuleAutenticado