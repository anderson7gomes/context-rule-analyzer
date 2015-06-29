package br.ufc.rulesengine.rules;

import java.util.Map;
import java.util.regex.Pattern;

public class IsCamelCaseRule implements AbstractRule<String> {

	private static final Pattern _singleCamelCasePiece = Pattern
			.compile("^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$");

	public boolean apply(String nome) {

		return _singleCamelCasePiece.matcher(nome).find();
	}

	public boolean apply(Map<String, Object> ctx) {
		// TODO Auto-generated method stub
		return false;
	}

}
