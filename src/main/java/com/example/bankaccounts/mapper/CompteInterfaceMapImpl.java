package com.example.bankaccounts.mapper;


import com.example.bankaccounts.Entities.Compte;
import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.dto.CompteResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class CompteInterfaceMapImpl implements CompteInterfaceMap {


    @Override
    public Compte compteRequestDTO2Compte(CompteRequestDTO compteRequestDTO) {
        Compte c = new Compte();

        c.setSolde(compteRequestDTO.getSolde());
        c.setType(compteRequestDTO.getType());
        return c;
    }

    @Override
    public CompteResponseDTO compteResponseDTO(Compte compte) {
        CompteResponseDTO c = new CompteResponseDTO();

        //BeanUtils.copyProperties(compte, c);

        c.setIdCompte(compte.getIdCompte());
        c.setSolde(compte.getSolde());
        c.setType(compte.getType());
        return c;
    }
}
