package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le lien est requis")
    private String lien;

    @NotBlank(message = "Le type est requis")
    private String type; // rapport, presentation, etc...

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private SujetPFE sujet;
}
