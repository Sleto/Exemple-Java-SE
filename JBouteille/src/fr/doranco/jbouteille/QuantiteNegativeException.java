package fr.doranco.jbouteille;

public class QuantiteNegativeException extends Exception {

	public QuantiteNegativeException() {
		super();
	}

	public QuantiteNegativeException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuantiteNegativeException(String message) {
		super(message);
	}

	public QuantiteNegativeException(Throwable cause) {
		super(cause);
	}

}
