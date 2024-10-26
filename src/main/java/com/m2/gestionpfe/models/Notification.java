package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le message est requis")
    private String message;

    @ManyToOne
    @JoinColumn(name = "destinataire_id", nullable = false)
    @NotNull(message = "Le destinataire est requis")
    private Etudiant destinataire; // Ou Encadrant, selon la logique

    @NotNull(message = "La date d'envoi est requise")
    private LocalDateTime dateEnvoi;
}
