package com.example.bankaccounts.services;


import com.example.bankaccounts.Entities.Compte;
import com.example.bankaccounts.dto.CompteRequestDTO;
import com.example.bankaccounts.dto.CompteResponseDTO;
import com.example.bankaccounts.mapper.CompteInterfaceMap;
import com.example.bankaccounts.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CompteServiceInterfaceImpl implements CompteServiceInterface{


    @Autowired
    CompteRepository compteRepository;

    @Autowired
    CompteInterfaceMap compteInterfaceMap;

    @Override
    public void add(CompteRequestDTO compteRequestDTO) {
        Compte c = new Compte();
        c = compteInterfaceMap.compteRequestDTO2Compte(compteRequestDTO);
        compteRepository.save(c);
    }

    @Override
    public List<CompteResponseDTO> listerComptes() {
        List<Compte> liste = new ArrayList<Compte>();
        liste = compteRepository.findAll();
        List<CompteResponseDTO> l = new ArrayList<CompteResponseDTO>();

        for (Compte c:liste){
            CompteResponseDTO r = new CompteResponseDTO();
            //BeanUtils.copyProperties(c,r);
            r = compteInterfaceMap.compteResponseDTO(c);
            l.add(r);
        }
        return l;
    }

    @Override
    public CompteResponseDTO compteById(Integer id) {
        Compte c =  compteRepository.findById(id).get();
        CompteResponseDTO r = new CompteResponseDTO();
        //BeanUtils.copyProperties(c, cr);
        r = compteInterfaceMap.compteResponseDTO(c);


        return r;
    }

    @Override
    public void update(Integer id, CompteRequestDTO r) {

        Compte c1 = compteRepository.findById(id).get();

        if( r.getSolde()!= null )
            c1.setSolde(r.getSolde());
        if(r.getType()!=null) c1.setType(r.getType());
        compteRepository.save(c1);
    }

    @Override
    public void delete(Integer id) {
        compteRepository.deleteById(id);
    }
}
