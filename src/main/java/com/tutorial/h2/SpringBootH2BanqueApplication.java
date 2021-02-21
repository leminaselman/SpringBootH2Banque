package com.tutorial.h2;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"controller","service","repository"})
public class SpringBootH2BanqueApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootH2BanqueApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringBootH2BanqueApplication.class, args);
		ClientRepository c = ctx.getBean(ClientRepository.class);
		CompteRepository cp = ctx.getBean(CompteRepository.class);
		OperationRepository op = ctx.getBean(OperationRepository.class);
		IBanque bm = ctx.getBean(BanqueMetierImpl.class);

		Client c1 = c.save(new Client("med", "med.iscae.mr"));
		Client c2 = c.save(new Client("ahmed", "ahmed.iscae.mr"));

		Compte cp1 = cp.save(new Compte(22, new Date(), c1));
		Compte cp2 = cp.save(new Compte(33, new Date(), c2));

		bm.verser(cp1.getcodeCompte(), 4.4);
		bm.retirer(cp1.getcodeCompte(), 3.2);
		bm.virement(cp1.getcodeCompte(), cp2.getcodeCompte(), 5);
		bm.OperationsClient(cp1);

	}

}
