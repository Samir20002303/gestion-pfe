package com.m2.gestionpfe.repositories;

import com.m2.gestionpfe.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
