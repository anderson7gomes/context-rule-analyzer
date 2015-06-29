package br.ufc.rulesengine.test;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;
import br.ufc.rulesengine.core.PropertyNotValidException;
import br.ufc.rulesengine.core.Status;

public class RuleCadastrado extends BasicRule {

	public RuleCadastrado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleCadastrado
	
	@Override
	public boolean apply(Context context) {
		
		Boolean cadastrado = null;
		
		try {
		
			cadastrado = (Boolean) check(context.getProperty("Cadastrado"));
		
		} catch (PropertyNotValidException e) {
			System.err.println(e.getMessage());
		}
		
		return (cadastrado) ? true : false;
		
	} // end method apply
	
	@Override
	public Object check(Object prop) throws PropertyNotValidException {
		
		if (prop instanceof Boolean) {
			return prop;
		}
		
		throw new PropertyNotValidException();
		
	} // end method check
	
} // end class RuleCadastrado