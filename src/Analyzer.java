import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Analyzer {

	Context context;
	List<Rule> rules;
	
	Map<Object, Status> qualities;
	
	public Analyzer(Context context, List<Rule> rules) {
		
		this.context = context;
		this.rules = rules;
		
		qualities = new LinkedHashMap<Object, Status>();
		
	} // end constructor Analyzer
	
	public Analyzer(Context context) {
		
		this(context, new ArrayList<Rule>());
		
	} // end constructor Analyzer
	
	public void addRule(Rule rule) {
		
		rules.add(rule);
		
	} // end method addRule
	
	public Map<Object, Status> analyze() {
		
		for (Rule rule : rules) {
			
			rule.apply(context);
			
			qualities.put(rule.getIdentifier(), rule.getQualityLevel());
			
		}
		
		return qualities;
		
	} // end method applyRules
	
} // end class Analyzer