package com.example.bankaccounts.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Compte {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idCompte;
    private Double solde;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
