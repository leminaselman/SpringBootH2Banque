package com.tutorial.h2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class BanqueMetierImpl implements IBanque {

	@Autowired
	private CompteRepository compteRepository;

	@Autowired
	private OperationRepository operationRepository;
	
	

	@Override
	public Compte consulterCompte(String codeCompte) {
		Compte cp = compteRepository.findById(codeCompte).get();
		if (cp == null)
			throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@Override
	public void verser(String codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		Versement v = new Versement(montant, cp);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde() + montant);
		compteRepository.save(cp);
	}

	@Override
	public void retirer(String codeCompte, double montant) {
		Compte cp = consulterCompte(codeCompte);
		Retrait v = new Retrait(montant, cp);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde() - montant);
		compteRepository.save(cp);
	}

	@Override
	public void virement(String codeCompte1, String codeCompte2, double montant) {

		if (codeCompte1.equals(codeCompte2)) {
			throw new RuntimeException("Impossibile de faire un virement sur le même compte");
		}

		retirer(codeCompte1, montant);
		verser(codeCompte2, montant);

	}

	@Override
	public List<Operation> OperationsClient(Compte compte) {
		return operationRepository.findAll();
	}



	
}
