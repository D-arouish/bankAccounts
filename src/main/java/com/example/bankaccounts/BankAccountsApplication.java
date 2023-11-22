package com.example.bankaccounts;

import com.example.bankaccounts.Entities.Compte;
import com.example.bankaccounts.Entities.TypeCompte;
import com.example.bankaccounts.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BankAccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {



        return args->{
            for(int i=0;i<10;i++) {
                Compte c = Compte.builder().solde(Math.random()*9999+2000).type(Math.random()>0.5? TypeCompte.Courant:TypeCompte.Epargne).build();
                compteRepository.save(c);
            }

            List<Compte> listes = compteRepository.findAll();
            for (Compte cplistes : listes) {
                System.out.println("------------");
                System.out.println(cplistes.getSolde());
                System.out.println(cplistes.getType());
            }
        };


    }
}
