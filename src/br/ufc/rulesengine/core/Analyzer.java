package br.ufc.rulesengine.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Analyzer {

	Context context;
	List<BasicRule> rules;
	
	Map<Object, Status> qualities;
	
	public Analyzer(Context context, List<BasicRule> rules) {
		
		this.context = context;
		this.rules = rules;
		
		qualities = new LinkedHashMap<Object, Status>();
		
	} // end constructor Analyzer
	
	public Analyzer(Context context) {
		
		this(context, new ArrayList<BasicRule>());
		
	} // end constructor Analyzer
	
	public void addRule(BasicRule rule) {
		
		rules.add(rule);
		
	} // end method addRule
	
	public Map<Object, Status> analyze() {
		
		for (BasicRule rule : rules) {
			
			qualities.put(rule.getIdentifier(), rule.apply(context));
			
		}
		
		return qualities;
		
	} // end method applyRules
	
} // end class Analyzer