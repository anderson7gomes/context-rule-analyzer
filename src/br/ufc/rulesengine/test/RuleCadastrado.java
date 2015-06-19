package br.ufc.rulesengine.test;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;
import br.ufc.rulesengine.core.Status;

public class RuleCadastrado extends BasicRule {

	public RuleCadastrado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleCadastrado
	
	@Override
	public Status apply(Context context) {
		
		Boolean cadastrado = (Boolean) context.getProperty("Cadastrado");
		
		return (cadastrado) ? Status.GOOD : Status.BAD;
		
	} // end method apply
	
} // end class RuleCadastrado