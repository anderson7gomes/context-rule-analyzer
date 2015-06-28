package br.ufc.rulesengine.rules;

import java.util.HashMap;
import java.util.Map;

public class NotRule implements AbstractRule<Boolean> {

	// TODO: melhor param ser uma classe, com name, class etc?
	// TODO: analisar o macarrão
	public enum ParameterName {

		VALUE;

		@Override
		public String toString() {

			return this.getClass().getCanonicalName() + super.toString();
		}
	}

	private final Map<ParameterName, Class<?>> _mapParameterNameParameterClass = new HashMap<ParameterName, Class<?>>();

	public boolean apply(Boolean parameter) {

		return !parameter;
	}

	public AbstractRule<? extends Object> addParameter(
			ParameterName parameterName, Class<?> class1) {

		_mapParameterNameParameterClass.put(parameterName, class1);

		return this;
	}

	public boolean apply(Map<String, Object> ctx) {

		Object object = ctx.get(ParameterName.VALUE.toString());
		Class<?> class1 = _mapParameterNameParameterClass
				.get(ParameterName.VALUE);
		Object cast = class1.cast(object);

		return true;
	}

}
