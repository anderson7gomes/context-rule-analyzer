import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Object, Object> properties = new LinkedHashMap<Object, Object>();
		
		properties.put("Autenticado", new Boolean(false));
		properties.put("Cadastrado", new Boolean(true));
		
		Context context = new Context(properties);
		
		Rule autenticado = new RuleAutenticado("Autenticado");
		Rule cadastrado = new RuleCadastrado("Cadastrado");
		
		Analyzer analyzer = new Analyzer(context);
		analyzer.addRule(autenticado);
		analyzer.addRule(cadastrado);
		
		System.out.println(analyzer.analyze());
		
	} // end method main

} // end class Test