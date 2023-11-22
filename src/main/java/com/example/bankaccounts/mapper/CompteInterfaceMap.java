package com.example.bankaccounts.mapper;

import com.example.bankaccounts.Entities.Compte;
import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.dto.CompteResponseDTO;

public interface CompteInterfaceMap {
    public Compte compteRequestDTO2Compte(CompteRequestDTO compteRequestDTO);
    public CompteResponseDTO compteResponseDTO(Compte compte);



}