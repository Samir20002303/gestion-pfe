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
    @JoinColumn(name = "destinataire_etudiant_id")
    private Etudiant destinataireEtudiant; // Peut être null

    @ManyToOne
    @JoinColumn(name = "destinataire_encadrant_id")
    private Encadrant destinataireEncadrant; // Peut être null


    @NotNull(message = "La date d'envoi est requise")
    private LocalDateTime dateEnvoi;

    // Méthode pour valider le destinataire
    public void validateDestinataire() {
        if (destinataireEtudiant == null && destinataireEncadrant == null) {
            throw new IllegalArgumentException("Un destinataire doit être spécifié.");
        }
    }
}
