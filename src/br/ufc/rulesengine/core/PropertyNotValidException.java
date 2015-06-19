package br.ufc.rulesengine.core;

public class PropertyNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PropertyNotValidException(String message) {
		
		super(message);
		
	} // end constructor PropertyNotValidException
	
	public PropertyNotValidException() {
		
		this("A propriedade nao e valida");
		
	} // end constructor PropertyNotValidException
	
} // end class PropertyNotValidException