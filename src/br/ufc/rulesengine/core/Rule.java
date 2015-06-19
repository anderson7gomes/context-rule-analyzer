package br.ufc.rulesengine.core;

public interface Rule {
	
	Status apply(Context context);
	
} // end interface Rule