package fr.doranco.aupetitcafe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Une application Au Petit Caf�
 */
public class AuPetitCafe {

	public static void main(String[] args) throws MontantInsuffisantException {

		final Boisson the;
		final Boisson cafe = new Boisson("Caf�", BigDecimal.valueOf(0.5d));
		final Boisson chocolat = new Boisson("Chocolat", BigDecimal.valueOf(2));
		
		the = new Boisson("Th�", BigDecimal.valueOf(3));
		
		Boisson[] boissonsDisponibles = { the, cafe, chocolat };
		
		// Instancier une machine caf�.
		MachineCafe appareil = new MachineCafe(boissonsDisponibles);
		
		// Demander la carte des boissons.
		Boisson[] boissons = appareil.obtenirBoissons();
		
		// J'ai command� la boisson 3 en payant 5�.
		appareil.commander(boissons[2], BigDecimal.valueOf(5d));
		
		double pi = Math.PI;
		Math.sqrt(pi);
		
	}

}
