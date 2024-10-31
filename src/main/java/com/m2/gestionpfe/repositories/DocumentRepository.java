package com.m2.gestionpfe.repositories;

import com.m2.gestionpfe.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
