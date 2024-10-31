package com.m2.gestionpfe.repositories;

import com.m2.gestionpfe.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
