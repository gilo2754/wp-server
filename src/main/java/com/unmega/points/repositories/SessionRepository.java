package com.unmega.points.repositories;

import com.unmega.points.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository <Session, Long> {
}
