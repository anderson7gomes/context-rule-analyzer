package br.ufc.rulesengine.core;

import java.util.regex.Pattern;

public class IsCamelCaseRule {

	private static final Pattern _single_camel_case_piece = Pattern
			.compile("^([A-Z][a-z]*)(\\s[A-Z][a-z]*)*$");

	public boolean apply(String nome) {

		return _single_camel_case_piece.matcher(nome).find();
	}

}
