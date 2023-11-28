package com.example.bankaccounts.web;

import com.example.bankaccounts.Entities.Compte;
import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.repositories.CompteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class compteGraphController {
    @Autowired
    CompteRepository compteRepository;
    @QueryMapping
    public List<Compte>  listerComptes () {return compteRepository.findAll();}
    @QueryMapping
    public Compte compteById(@Argument Integer id){
        return compteRepository.findById(id).get();
    }


    @MutationMapping
    public Compte addCompte(@Argument CompteRequestDTO compte){

        Compte r = new Compte();
        BeanUtils.copyProperties(compte,r);
        return compteRepository.save(r);
    }


}
