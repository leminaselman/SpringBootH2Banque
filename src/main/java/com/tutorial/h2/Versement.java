package com.tutorial.h2;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Versement")
@DiscriminatorValue("V")
public class Versement extends Operation{
	
	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Versement(double montant, Compte compte) {
		super(montant, compte);
		// TODO Auto-generated constructor stub
	}


	
	
}
