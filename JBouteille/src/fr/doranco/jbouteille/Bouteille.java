// Instruction le package de la classe (Les packages sont une unité organisationnelle des classes)
package fr.doranco.jbouteille;

// Ligne de commentaires
/* 
 * Bloc de commentaires
 */
/**
 * Bloc de commentaires documentaires (Javadoc)
 */
public class Bouteille extends AbstractContenantOuvrable {
	
	Boolean ouverte;

	/*
	 * Signature de méthode [visibilite] [typeDeRetour] [nom]([parametres])
	 */

	/*
	 * Signature d'un constructeur [visibilite] NomDeLaClasse([parametres])
	 */

	// === Les constructeurs ===

	/**
	 * Construire une bouteille.
	 * 
	 * @param contenance
	 *            Une contenance exprimée en litre.
	 * @param matiere
	 *            Une matière.
	 * @param forme
	 *            Une forme.
	 */
	public Bouteille(Double contenance, String matiere, String forme) {

		super();
		this.contenance = contenance;
		this.contenu = 0d;
		this.forme = forme;
		this.matiere = matiere;
		this.ouverte = false;

	}

	// === Les getters/setters ou accesseurs ===

	public Boolean getOuverte() {
		return ouverte;
	}

	// === Les méthodes de membre ===

	/**
	 * Ouvrir la bouteille.
	 */
	public void ouvrir() {

		if (!this.ouverte) {
			this.ouverte = true;
			System.out.println("Je suis ouverte.");
		} else {
			System.out.println("Je suis déjà ouverte.");
		}

	}

	/**
	 * Fermer la bouteille.
	 */
	public void fermer() {

		if (this.ouverte) {
			this.ouverte = false;
			System.out.println("Je suis fermée.");
		} else {
			System.out.println("Je suis déjà fermée.");
		}

	}

}
