package form;

import org.apache.struts.action.ActionForm;

public class LieuForm extends ActionForm{
	public int numLieu;
	 
	   public String nomLieu;

	   public String adresse;

	   public int nbCategorie;
	 
	   public int capacite;

	public int getNumLieu() {
		return numLieu;
	}

	public void setNumLieu(int numLieu) {
		this.numLieu = numLieu;
	}

	public String getNomLieu() {
		return nomLieu;
	}

	public void setNomLieu(String nomLieu) {
		this.nomLieu = nomLieu;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbCategorie() {
		return nbCategorie;
	}

	public void setNbCategorie(int nbCategorie) {
		this.nbCategorie = nbCategorie;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	   
}
