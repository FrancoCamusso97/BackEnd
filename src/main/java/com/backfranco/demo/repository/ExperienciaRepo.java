package com.backfranco.demo.repository;

import com.backfranco.demo.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepo extends JpaRepository <Experiencia, Long> {
}
