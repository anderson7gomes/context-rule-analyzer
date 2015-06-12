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