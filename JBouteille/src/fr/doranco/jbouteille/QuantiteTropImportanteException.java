package fr.doranco.jbouteille;

public class QuantiteTropImportanteException extends Error {
	
	public Double quantite;
	
	public Double volumeDisponible;

	public QuantiteTropImportanteException() {
		super();
	}

	public QuantiteTropImportanteException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuantiteTropImportanteException(String message, Double quantite, Double volumeDisponible) {
		super(message);
		this.quantite = quantite;
		this.volumeDisponible = volumeDisponible;
	}

	public QuantiteTropImportanteException(Throwable cause) {
		super(cause);
	}
	
}
