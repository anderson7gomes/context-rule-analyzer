package br.ufc.rulesengine.core;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FixedParameterRule {

	@Test
	public void seParameterTrueEntaoNotRuleReturnsFalse() {

		final boolean parameter = true;

		final boolean result = new NotRule().apply(parameter);

		assertThat(result, is(not(parameter)));
	}

	@Test
	public void seParameterFalseEntaoNotRuleReturnsTrue() {

		final boolean parameter = false;

		final boolean result = new NotRule().apply(parameter);

		final boolean expectedResult = !false;

		assertThat(result, is(expectedResult));
	}

	@Test
	public void seNomeEmCamelCaseEntaoIsCamelCaseRuleReturnsTrue() {

		final String nome = "Abelardo Vieira Mota";

		final boolean result = new IsCamelCaseRule().apply(nome);

		final boolean expectedResult = true;

		assertThat(result, is(expectedResult));
	}

	@Test
	public void seNomeNaoEmCamelCaseEntaoIsCamelCaseRuleReturnsFalse() {

		final String nome = "Abelardo VieiraMota";

		final boolean result = new IsCamelCaseRule().apply(nome);

		final boolean expectedResult = false;

		assertThat(result, is(expectedResult));
	}

}
