package main;

@SuppressWarnings("serial")
public class ZeroDivisionException extends Exception {
	
	public ZeroDivisionException() {
		super("Nombre divisé par zero") ;
	}

}
