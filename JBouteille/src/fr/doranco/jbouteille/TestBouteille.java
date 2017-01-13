package fr.doranco.jbouteille;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests unitaires de la {@link Bouteille}
 * 
 * @author JFDC
 */
public class TestBouteille {
	
	@Test
	public void testOuvrir() {
	
		// Initialisation
		Bouteille bouteilleTest = new Bouteille(1d, "Plastique", "Quelconque");
		
		// Execution du test
		bouteilleTest.ouvrir();
		
		// Vérification
		Assert.assertEquals(true, bouteilleTest.getOuverte());
		
	}

}
