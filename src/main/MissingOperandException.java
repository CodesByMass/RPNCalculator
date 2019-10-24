package main;

@SuppressWarnings("serial")
public class MissingOperandException extends Exception {
	
	public MissingOperandException() {
		super("Il manque un opérande !") ;
	}

}
