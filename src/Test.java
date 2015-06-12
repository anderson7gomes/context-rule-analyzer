import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Object, Object> properties = new LinkedHashMap<Object, Object>();
		
		properties.put("Disciplina 1", new HorarioDisciplina(10, 12));
		properties.put("Disciplina 2", new HorarioDisciplina(11, 13));
		
		Context context = new Context(properties);
		
		Rule conflitoHorario = new RuleConflitoHorario("Conflito de horário");
		
		Analyzer analyzer = new Analyzer(context);
		//analyzer.addRule(autenticado);
		//analyzer.addRule(cadastrado);
		
		System.out.println(analyzer.analyze());
		
	} // end method main

} // end class Test