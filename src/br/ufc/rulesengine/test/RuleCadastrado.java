package br.ufc.rulesengine.test;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.Rule;
import br.ufc.rulesengine.core.Status;

public class RuleCadastrado extends Rule {

	public RuleCadastrado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleCadastrado
	
	@Override
	public void apply(Context context) {
		
		Boolean cadastrado = (Boolean) context.getProperty("Cadastrado");
		
		setQualityLevel((cadastrado) ? Status.GOOD : Status.BAD);
		
	} // end method apply
	
} // end class RuleCadastrado