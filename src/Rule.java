public abstract class Rule {
	
	private Status qualityLevel = Status.NOT_SET;

	private String identifier;
	
	public Rule(String identifier) {
		
		this.identifier = identifier;
		
	} // end constructor Rule
	
	public abstract void apply(Context context);
	
	protected void setQualityLevel(Status qualityLevel) {
		
		this.qualityLevel = qualityLevel;
		
	} // end method setQualityLevel
	
	public Status getQualityLevel() {
		
		return qualityLevel;
		
	} // end method getQualityLevel
	
	public String getIdentifier() {
		
		return identifier;
		
	} // end method getIdentifier
	
} // end class Rule