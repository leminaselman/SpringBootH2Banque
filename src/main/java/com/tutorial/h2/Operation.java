package com.tutorial.h2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // une table pour toute la hierarchie de classe
@DiscriminatorColumn(name = "TYPE_OPERATION", discriminatorType = DiscriminatorType.STRING, length = 1)
public abstract class Operation implements Serializable{
	@Id
	@GeneratedValue
	private Long numero;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name = "CODE_COMPTE")
	private Compte compte;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operation( double montant, Compte compte) {
		super();
		this.montant = montant;
		this.compte = compte;
	}
	

}
