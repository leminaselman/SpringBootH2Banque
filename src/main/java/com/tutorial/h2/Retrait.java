package com.tutorial.h2;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(double montant, Compte compte) {
		super( montant, compte);
		// TODO Auto-generated constructor stub
	}
	

}

