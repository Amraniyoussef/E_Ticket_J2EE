package form;

import java.sql.Time;

import org.apache.struts.action.ActionForm;

public class SeanceForm extends ActionForm {
	 public int numSeance;

	   public Time heureDebut;

	   public Time heureFin;

	public int getNumSeance() {
		return numSeance;
	}

	public void setNumSeance(int numSeance) {
		this.numSeance = numSeance;
	}

	public Time getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Time heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Time getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}
	   
}
