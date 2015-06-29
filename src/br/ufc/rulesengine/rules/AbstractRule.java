package br.ufc.rulesengine.rules;

import java.util.Map;

public interface AbstractRule<E> {

	@Deprecated
	boolean apply(E parameter);

	boolean apply(Map<String, Object> ctx);

}
