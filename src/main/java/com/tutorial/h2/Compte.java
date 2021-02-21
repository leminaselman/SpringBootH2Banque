package com.tutorial.h2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE", discriminatorType = DiscriminatorType.STRING, length = 2)*/
@Entity
public class Compte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String codeCompte;
	private double solde;
	// @Temporal(TemporalType.DATE)
	private Date dateCreation;

	@ManyToOne
	@JoinColumn(name = "CODE_CLI")
	private Client client;

	@OneToMany(mappedBy = "compte")
	private Collection<Operation> operations;

	public Compte(double solde, Date dateCreation, Client client) {
		super();
		this.solde = solde;
		this.dateCreation=dateCreation;
		this.client = client;
	}

	Compte(){
		
	}
	public String getcodeCompte() {
		return codeCompte;
	}

	public void setcodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}