package br.ufc.rulesengine.test;

import java.util.ArrayList;
import java.util.List;

import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.Rule;
import br.ufc.rulesengine.core.Status;

public class RuleConflitoHorario extends Rule {

	public RuleConflitoHorario(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleConflitoHorario
	
	@Override
	public void apply(Context context) {
		
		List<Object> disciplinas = new ArrayList<Object>(context.getProperties().keySet());
		
		for (int i = 0; i < disciplinas.size(); i++) {
			
			HorarioDisciplina hd1 = 
					(HorarioDisciplina) context.getProperty(disciplinas.get(i));
			
			for (int j = 0; j < disciplinas.size(); j++) {
				
				if (i != j) {
					
					HorarioDisciplina hd2 = 
							(HorarioDisciplina) context.getProperty(disciplinas.get(j));
					
					if (interfere(hd1, hd2)) {
						
						setQualityLevel(Status.BAD);
						return;
						
					}
					
				}
				
			}
			
		}
		
		setQualityLevel(Status.GOOD);
		
	} // end method apply
	
	public boolean interfere(HorarioDisciplina hd1, HorarioDisciplina hd2) {
		
		if (hd1.getHorarioInicio() < hd2.getHorarioInicio() && 
				hd1.getHorarioFim() > hd2.getHorarioInicio() && 
				hd1.getHorarioFim() < hd2.getHorarioFim()) {
			
			return true;
			
		}
		
		return false;
		
	} // end method interfere
	
} // end class RuleConflitoHorario