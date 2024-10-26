package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sujet_pfe")

public class SujetPFE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le titre est requis")
    private String titre;

    @NotBlank(message = "La description est requise")
    private String description;

    @Column(name = "nombre_etudiants_necessaires")
    @Min(value = 1, message = "Le nombre d'etudiants doit etre au moins 1")
    private int nombreEtudiantsNecessaires;

    @ManyToOne
    @JoinColumn(name = "encadrant_id", nullable = false)
    private Encadrant encadrant;
}
