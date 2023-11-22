package com.example.bankaccounts.web;

import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.dto.CompteResponseDTO;
import com.example.bankaccounts.repositories.CompteRepository;
import com.example.bankaccounts.services.CompteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//our web service
@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
public class RestController {
    @Autowired
    CompteRepository compteRepository;
    @Autowired
    CompteServiceInterface compteServiceInterface;

    @GetMapping("/Comptes")
    public List<CompteResponseDTO> getAll(){
        //return compteRepository.findAll();
        return compteServiceInterface.listerComptes();
    }

    @GetMapping ("/Comptes/{id}")
    public CompteResponseDTO getId(@PathVariable Integer id){
        return  compteServiceInterface.compteById(id);
    }


    @PostMapping("/Comptes/{id}")
    public void save(@RequestBody CompteRequestDTO c){
        compteServiceInterface.add(c);
    }


    //*****************************
    @PutMapping ("/Comptes/{id}")
    public void save(@PathVariable("id") Integer id, @RequestBody CompteRequestDTO c){
        compteServiceInterface.update(id,c);


        //c.setIdCompte(id);
        // Compte r = compteRepository.findById(id).get();
        // r.setIdCompte(id);

        // if (c.getSolde() != null){r.setSolde(c.getSolde());}
        // if(c.getType() !=null) {r.setType(c.getType());}
        // compteRepository.save(r);

    }

    @DeleteMapping ("/Comptes/{id}")
    public void supprimer(@PathVariable("id") Integer id){
        compteServiceInterface.delete(id);
    }



}

