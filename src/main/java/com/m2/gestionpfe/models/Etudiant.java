package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "etudiants")
public class Etudiant {

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

    @NotBlank(message = "Le code d'apogee est requis")
    @Column(unique = true)
    private String codeApogee;

    @NotBlank(message = "La filiere est requise")
    private String filiere;
}
