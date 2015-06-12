public class RuleConflitoHorario extends Rule {

	public RuleConflitoHorario(String identifier) {
		
		super(identifier);
		
	} // end constructor RuleConflitoHorario
	
	@Override
	public void apply(Context context) {
		
		for (Object disciplina : context.getProperties().keySet()) {
			
			//for ()
			
		}
		
	} // end method apply
	
} // end class RuleConflitoHorario