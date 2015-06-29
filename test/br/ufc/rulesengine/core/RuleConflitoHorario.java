package br.ufc.rulesengine.core;

import java.util.ArrayList;
import java.util.List;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;
import br.ufc.rulesengine.core.Status;
import br.ufc.rulesengine.core.PropertyNotValidException;;

public class RuleConflitoHorario extends BasicRule {

	public RuleConflitoHorario(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleConflitoHorario
	
	@Override
	public boolean apply(Context context) {
		
		List<Object> disciplinas = new ArrayList<Object>(context.getProperties().keySet());
		
		try {
		
			for (int i = 0; i < disciplinas.size(); i++) {
				
				HorarioDisciplina hd1 = 
						(HorarioDisciplina) check(context.getProperty(disciplinas.get(i)));
				
				for (int j = 0; j < disciplinas.size(); j++) {
					
					if (i != j) {
						
						HorarioDisciplina hd2 = 
								(HorarioDisciplina) check(context.getProperty(disciplinas.get(j)));
						
						if (interfere(hd1, hd2)) {
							
							return false;
							
						}
						
					}
					
				}
				
			}
			
		} catch (PropertyNotValidException e) {
			System.err.println(e.getMessage());
		}
		
		return true;
		
	} // end method apply
	
	public boolean interfere(HorarioDisciplina hd1, HorarioDisciplina hd2) {
		
		if (hd1.getHorarioInicio() < hd2.getHorarioInicio() && 
				hd1.getHorarioFim() > hd2.getHorarioInicio() && 
				hd1.getHorarioFim() < hd2.getHorarioFim()) {
			
			return true;
			
		}
		
		return false;
		
	} // end method interfere
	
	@Override
	public Object check(Object prop) throws PropertyNotValidException {
		
		if (prop instanceof HorarioDisciplina) {		
				return prop;
		}
		
		throw new PropertyNotValidException();
			
	} // end method assign
	
} // end class RuleConflitoHorario