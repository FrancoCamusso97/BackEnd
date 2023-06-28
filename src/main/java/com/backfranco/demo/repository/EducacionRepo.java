package com.backfranco.demo.repository;

import com.backfranco.demo.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepo extends JpaRepository<Educacion, Long> {
}
