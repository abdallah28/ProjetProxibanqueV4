package org.formation.spring.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

/**
 * @author Stephane-abdallah :La classe CompteCourant est une classe qui h�rite les
 *         attributs et m�thodes de la classe Compte. nous souhaitons la
 *         persister. En plus des attributs et m�thodes h�rit�s, elle a une
 *         particularit� de plafondDecouvert.
 *
 */
@Entity
@Component
public class CompteCourant extends Compte{

	
	private Double plafondDecouvert;

	public CompteCourant() {
		super();
	}

	public CompteCourant(Double plafondDecouvert) {
		super();
		this.plafondDecouvert = plafondDecouvert;
	}

	/**
	 * @return the plafondDecouvert
	 */
	public Double getPlafondDecouvert() {
		return plafondDecouvert;
	}

	/**
	 * @param plafondDecouvert the plafondDecouvert to set
	 */
	public void setPlafondDecouvert(Double plafondDecouvert) {
		this.plafondDecouvert = plafondDecouvert;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [plafondDecouvert=" + plafondDecouvert + "]";
	}
	
	
	
	
}
