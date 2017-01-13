package fr.doranco.aupetitcafe;

import java.math.BigDecimal;

/**
 * Une machine à café.
 */
public class MachineCafe {
	
	/** La liste des boissons disponibles */
	private Boisson[] boissonsDisponibles;
	
	public MachineCafe() {
		super();
	}
	
	public MachineCafe(Boisson[] boissonsDisponibles) {
		super();
		this.boissonsDisponibles = boissonsDisponibles;
	}

	/**
	 * Obtenir la liste des boissons disponibles.
	 * 
	 * @return une liste de boissons.
	 */
	public Boisson[] obtenirBoissons() {
		return this.boissonsDisponibles;
	}
	
	public Gobelet commander(Boisson boissonCommandee, BigDecimal montant) throws MontantInsuffisantException {
		
		reglerCommande(boissonCommandee, montant);
		
		Gobelet gobelet = new Gobelet(0.1d, 0d, null, false);
		
		// Remplir le gobelet avec de la boisson commandée.
		gobelet.setContenu(boissonCommandee);
		gobelet.setQuantiteContenu(0.1d);
		
		return gobelet;
	}
	
	private void reglerCommande(Boisson boissonCommandee, BigDecimal montant) throws MontantInsuffisantException {
		
		if (boissonCommandee.getPrix().compareTo(montant) <= 0)
			System.out.println("La commande est réglée.");
		else
			throw new MontantInsuffisantException();
		
	}

}
