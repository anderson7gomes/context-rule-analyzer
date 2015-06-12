import java.util.LinkedHashMap;
import java.util.Map;

public class Context {

	Map<Object, Object> properties;
	
	public Context(Map<Object, Object> properties) {
		
		this.properties = properties;
		
	} // end constructor Context with one parameter
	
	public Context() {
		
		this(new LinkedHashMap<Object, Object>());
		
	} // end constructor Context with no parameter
	
	public void addProperty(Object propertie, Object value) {
		
		properties.put(propertie, value);

	} // end method addPropertie
	
	public Object getProperty(Object property) {
		
		return properties.get(property);
		
	} // end method getPropertyValue
	
} // end class Context