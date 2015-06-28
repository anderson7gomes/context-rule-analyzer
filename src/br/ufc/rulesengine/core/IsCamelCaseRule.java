package br.ufc.rulesengine.core;

import java.util.regex.Pattern;

public class IsCamelCaseRule {

	private static final Pattern _blank_char = Pattern.compile("\\s");
	private static final Pattern _single_camel_case_piece = Pattern
			.compile("^[A-Z][a-z]*$");

	public boolean apply(String nome) {

		final String[] nomeSplitted = _blank_char.split(nome);

		boolean isInCamelCase = true;

		for (String piece : nomeSplitted) {

			// if (!Character.isUpperCase(piece.charAt(0))) {
			//
			// isInCamelCase = false;
			// }

			System.out.println(piece);
			if (!_single_camel_case_piece.matcher(piece).find()) {

				isInCamelCase = false;
			}
		}

		return isInCamelCase;
	}

}
