package com.tutorial.h2;

import java.util.List;

public interface IBanque {
	public Compte consulterCompte(String codeCompte);

	public void verser(String codeCompte, double montant);

	public void retirer(String codeCompte, double montant);

	public void virement(String codeCompte1, String codeCompte2, double montant);

	/* public Page<Operation> listOperation(String codeCpte, int page, int size); */
	public List<Operation> OperationsClient(Compte compte);
	

}
