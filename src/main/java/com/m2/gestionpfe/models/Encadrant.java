package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "encadrants")
public class Encadrant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom est requis")
    private String nom;

    @NotBlank(message = "Le prenom est requis")
    private String prenom;

    @Email(message = "Email non  valide")
    @NotBlank(message = "L'email est requis")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Le mot de passe est requis")
    private String motDePasse;

    @NotBlank(message = "Le departement est requis")
    private String departement;

    // Un encadrant supervise plusieur sujets
    @OneToMany(mappedBy = "encadrant")
    private List<SujetPFE> sujets;

    // Un encadrant peut avoir plusieurs rendez-vous
    @OneToMany(mappedBy = "encadrant")
    private List<RendezVous> rendezVousList;
}
