package br.ufc.rulesengine.test;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.Rule;
import br.ufc.rulesengine.core.Status;

public class RuleAutenticado extends Rule {

	public RuleAutenticado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleAutenticado
	
	@Override
	public void apply(Context context) {
		
		Boolean autenticado = (Boolean) context.getProperty("Autenticado");
		
		setQualityLevel((autenticado) ? Status.GOOD : Status.BAD);
		
 	} // end method apply
	
} // end class RuleAutenticado