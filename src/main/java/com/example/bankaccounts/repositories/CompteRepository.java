package com.example.bankaccounts.repositories;

import com.example.bankaccounts.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
