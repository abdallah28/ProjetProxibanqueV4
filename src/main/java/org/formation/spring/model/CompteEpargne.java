package org.formation.spring.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

/**
 * @author Stephane-Abdallah: La classe CompteEpargne est une classe qui h�rite les
 *         attributs et m�thodes de la classe Compte. nous souhaitons la
 *         persister. En plus des attributs et m�thodes h�rit�s, elle a une
 *         particularit� d'avoir un attributs tauxInteret.
 *
 */
@Entity
@Component
public class CompteEpargne extends Compte {

	private Double tauxInteret;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Double tauxInteret) {
		super();
		this.tauxInteret = tauxInteret;
	}

	/**
	 * @return the tauxInteret
	 */
	public Double getTauxInteret() {
		return tauxInteret;
	}

	/**
	 * @param tauxInteret the tauxInteret to set
	 */
	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + "]";
	}
	
	
	
}
