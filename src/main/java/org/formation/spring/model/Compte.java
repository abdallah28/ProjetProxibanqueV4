package org.formation.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

/**
 * @author Stephane-Abdallah: La classe abstract Compte est une classe qui ne
 *         peut �tre instanci�e. Elle contient les informations des diff�rents
 *         comptes et qui ont �t� factoris�s dnas cette classe. c'est la classe
 *         m�re des CompteEpargne et de Comptecourant
 *
 */
@Component
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompte;
	private Double solde;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	/**
	 * 
	 */
	public Compte() {
		super();
	}

	public Compte(int idCompte, Double solde, Client client) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.client = client;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + ", client=" + client + "]";
	}

}
