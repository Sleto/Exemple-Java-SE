package fr.doranco.jbouteille;

import java.text.MessageFormat;

public abstract class AbstractContenant {
	
	Double contenance;
	
	Double contenu;
	
	String forme;
	
	String matiere;

	public Double getContenance() {
		return contenance;
	}

	public Double getContenu() {
		return contenu;
	}

	public String getMatiere() {
		return matiere;
	}

	public String getForme() {
		return forme;
	}
	
	/**
	 * Vider d'une certaine quantité la bouteille.
	 * 
	 * @param quantite
	 *            Une quantité à vider.
	 */
	public void vider(Double quantite) {

		/* if (!this.ouverte) {

			String patron = "Je ne peux vider {0} litre(s), car je suis fermée.";
			String message = MessageFormat.format(patron, quantite);

			System.out.println(message);
			return;

		} */

		if (quantite < this.contenu) {

			// this.contenu = this.contenu - quantite;
			this.contenu -= quantite;

			String patron = "J''ai vidé {0} litre(s) sur {1} litre(s) disponibles. Il reste {2} litre(s).";
			String message = MessageFormat.format(patron, quantite, this.contenu + quantite, this.contenu);

			System.out.println(message);

		} else if (quantite == this.contenu) {

			this.contenu -= quantite;

			String patron = "J''ai vidé {0} litre(s) et je suis maintenant vide.";
			String message = MessageFormat.format(patron, quantite);

			System.out.println(message);

		} else {

			String patron = "Je ne peux vider {0} litre(s), car je ne contiens que {1} litre(s).";
			String message = MessageFormat.format(patron, quantite, this.contenu);

			System.out.println(message);

		}

	}

	/**
	 * Remplir d'une certaine quantité la bouteille.
	 * 
	 * @param quantite
	 *            Une quantité à remplir.
	 * @throws Exception
	 */
	public void remplir(Double quantite)
			throws QuantiteTropImportanteException, QuantiteNegativeException {

		if (quantite < 0)
			throw new QuantiteNegativeException("Je n'accepte pas les quantités négatives.");

		Double volumeDisponible = this.contenance - this.contenu;

		if (quantite > volumeDisponible) {
			String patron = "La quantité fournie ({0} litre(s)) n''est pas versable car supérieur au volume disponible ({1} litre(s)).";
			String message = MessageFormat.format(patron, quantite, volumeDisponible);

			throw new QuantiteTropImportanteException(message, quantite, volumeDisponible);
		}

		// contenu = contenu + quantite;
		this.contenu += quantite;

		String message = MessageFormat.format(
				"J''ai ajouté {0} litre(s), je dispose encore de {1} litre(s) disponible(s).", quantite,
				this.contenance - this.contenu);
		System.out.println(message);

	}
}
