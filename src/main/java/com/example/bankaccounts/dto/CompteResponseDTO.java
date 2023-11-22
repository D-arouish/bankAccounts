package com.example.bankaccounts.dto;


import com.example.bankaccounts.Entities.TypeCompte;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CompteResponseDTO {


    private Integer idCompte;
    private Double solde;
    private TypeCompte type;

}
