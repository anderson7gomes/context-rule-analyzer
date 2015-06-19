package br.ufc.rulesengine.core;

public abstract class BasicRule implements Rule {
	
	private String identifier;
	
	public BasicRule(String identifier) {
		
		this.identifier = identifier;
		
	} // end constructor Rule
	
	@Override
	public abstract Status apply(Context context);

	public String getIdentifier() {
		
		return identifier;
		
	} // end method getIdentifier
	
} // end class Rule