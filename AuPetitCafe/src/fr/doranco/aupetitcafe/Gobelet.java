package fr.doranco.aupetitcafe;

public class Gobelet {
	
	private final Double contenance;
	
	private Double quantiteContenu;
	
	private Boisson contenu;
	
	private Boolean sucre;

	public Gobelet() {
		super();
		this.contenance = 0.15d;
	}

	public Gobelet(final double contenance, final Double quantiteContenu,
			final Boisson contenu, final Boolean sucre) {
		super();
		this.contenance = contenance;
		this.quantiteContenu = quantiteContenu;
		this.contenu = contenu;
		this.sucre = sucre;
	}

	public Double getContenance() {
		return contenance;
	}

	public Double getQuantiteContenu() {
		return quantiteContenu;
	}

	public void setQuantiteContenu(Double quantiteContenu) {
		this.quantiteContenu = quantiteContenu;
	}

	public Boisson getContenu() {
		return contenu;
	}

	public void setContenu(Boisson contenu) {
		this.contenu = contenu;
	}

	public Boolean getSucre() {
		return sucre;
	}

	public void setSucre(Boolean sucre) {
		this.sucre = sucre;
	}
	
}
