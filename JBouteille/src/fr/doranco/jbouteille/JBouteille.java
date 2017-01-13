package fr.doranco.jbouteille;

import java.util.ArrayList;
import java.util.List;

/**
 * Une application JBouteille.
 * Cette classe modélise l'application JBouteille.
 * 
 * Cette classe ne sera jamais instanciée.
 *
 * @author JFDC
 */
public class JBouteille {

	/**
	 * Point d'entrée de l'application JBouteille.
	 * 
	 * @param args Paramètres de lancement de l'application.
	 */
	public static void main(String[] args) {
		
		// Nous instancions une bouteille d'eau d'un litre en plastique.
		Bouteille bouteilleDeVittel = new Bouteille(1.0d, "Plastique", "Classique");
		
		// Nous affichons les variables membres de notre bouteille.
		System.out.println("Contenance = " + bouteilleDeVittel.getContenance());
		System.out.println("Contenu = " + bouteilleDeVittel.getContenu());
		System.out.println("Forme = " + bouteilleDeVittel.getForme());
		System.out.println("Matiere = " + bouteilleDeVittel.getMatiere());
		System.out.println("Ouverte = " + bouteilleDeVittel.getOuverte());
		
		// Nous ouvrons et fermons notre bouteille.
		bouteilleDeVittel.ouvrir();
		bouteilleDeVittel.ouvrir();
		bouteilleDeVittel.fermer();
		bouteilleDeVittel.fermer();
		
		bouteilleDeVittel.ouvrir();
		bouteilleDeVittel.vider(0.1d);
		
		try {
			
			bouteilleDeVittel.remplir(4d);
			
		} catch (QuantiteNegativeException e) {
			
			System.out.println("Attention, nous n'acceptons pas les quantités de liquide négatives.");
			
		}

	}

}
