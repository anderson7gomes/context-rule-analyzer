package br.ufc.rulesengine.core;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;
import br.ufc.rulesengine.core.Status;
import br.ufc.rulesengine.core.PropertyNotValidException;

public class RuleAutenticado extends BasicRule {

	public RuleAutenticado(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleAutenticado
	
	@Override
	public boolean apply(Context context) {
	
		Boolean autenticado = null;
		
		try {
		
			autenticado = (Boolean) check(context.getProperty("Autenticado"));	
		
		} catch (PropertyNotValidException e) {
			System.err.println(e.getMessage());
		}
		
		return (autenticado) ? true : false;
		
 	} // end method apply
	
	@Override
	public Object check(Object prop) throws PropertyNotValidException {
		
		if (prop instanceof Boolean) {
			return prop;
		}
		
		throw new PropertyNotValidException();
		
	} // end method check
	
} // end class RuleAutenticado