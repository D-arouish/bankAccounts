package com.example.bankaccounts.dto;


import com.example.bankaccounts.Entities.TypeCompte;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CompteRequestDTO {


    private Double solde;
    private TypeCompte type;
}
