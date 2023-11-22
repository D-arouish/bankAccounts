package com.example.bankaccounts.services;

import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.dto.CompteResponseDTO;

import java.util.List;

public interface CompteServiceInterface {
    //POST
    public void add(CompteRequestDTO compteRequestDTO);
    //GET
    public List<CompteResponseDTO> listerComptes();
    //GET by id
    public CompteResponseDTO compteById(Integer id);
    //PUT
    public void update(Integer id, CompteRequestDTO r);
    //Delete
    public void delete (Integer id);
}
