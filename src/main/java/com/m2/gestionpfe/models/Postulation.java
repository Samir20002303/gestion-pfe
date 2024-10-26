package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "postulations")
public class Postulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "etudiant_id", nullable = false)
    @NotNull(message = "L'etudiant est requis")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    @NotNull(message = "Le sujet est requis")
    private SujetPFE sujet;

    @NotNull(message = "L'etat de la postulation est requis")
    private Boolean etat; // true pour acceptée, false pour non acceptée
}
