package com.m2.gestionpfe.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "soutenances")
public class Soutenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La date et l'heurE sont requises")
    private LocalDateTime dateHeure;

    @ManyToOne
    @JoinColumn(name = "sujet_id", nullable = false)
    private SujetPFE sujet;

    @ManyToOne
    @JoinColumn(name = "jury_id", nullable = false)
    private Jury jury;
}