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
@Table(name = "jury")
public class Jury {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le nom est requis")
    private String nom;

    @NotBlank(message = "Le prenom est requis")
    private String prenom;

    @Email(message = "Email non valide")
    @NotBlank(message = "L'email est requis")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Le role est requis")
    private String role; // rapporteur, président de jury, invité

    // Un jury peut évaluer plusieurs soutenances
    @ManyToMany(mappedBy = "jury")
    private List<Soutenance> soutenances;
}
