package br.ufc.rulesengine.test;

import java.util.LinkedHashMap;
import java.util.Map;

import br.ufc.rulesengine.core.Analyzer;
import br.ufc.rulesengine.core.Context;
import br.ufc.rulesengine.core.BasicRule;

public class Test {

	public static void main(String[] args) {

		Map<Object, Object> properties = new LinkedHashMap<Object, Object>();
		
		properties.put("Disciplina 1", new HorarioDisciplina(11, 14));
		properties.put("Disciplina 2", new HorarioDisciplina(13, 15));
		properties.put("Autenticado", new Boolean(false));
		properties.put("Cadastrado", new Boolean(true));
		
		Context context = new Context(properties);
		
		BasicRule conflitoHorario = new RuleConflitoHorario("Conflito de horário");
		BasicRule autenticado = new RuleAutenticado("Autenticado");
		BasicRule cadastrado = new RuleCadastrado("Cadastrado");
		
		Analyzer analyzer = new Analyzer(context);
		analyzer.addRule(conflitoHorario);
		analyzer.addRule(autenticado);
		analyzer.addRule(cadastrado);
		
		System.out.println(analyzer.analyze());
		
	} // end method main

} // end class Test