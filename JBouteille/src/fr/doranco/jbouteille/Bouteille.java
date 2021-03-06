// Instruction le package de la classe (Les packages sont une unit� organisationnelle des classes)
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
	 * Signature de m�thode [visibilite] [typeDeRetour] [nom]([parametres])
	 */

	/*
	 * Signature d'un constructeur [visibilite] NomDeLaClasse([parametres])
	 */

	// === Les constructeurs ===

	/**
	 * Construire une bouteille.
	 * 
	 * @param contenance
	 *            Une contenance exprim�e en litre.
	 * @param matiere
	 *            Une mati�re.
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

	// === Les m�thodes de membre ===

	/**
	 * Ouvrir la bouteille.
	 */
	public void ouvrir() {

		if (!this.ouverte) {
			this.ouverte = true;
			System.out.println("Je suis ouverte.");
		} else {
			System.out.println("Je suis d�j� ouverte.");
		}

	}

	/**
	 * Fermer la bouteille.
	 */
	public void fermer() {

		if (this.ouverte) {
			this.ouverte = false;
			System.out.println("Je suis ferm�e.");
		} else {
			System.out.println("Je suis d�j� ferm�e.");
		}

	}

}
