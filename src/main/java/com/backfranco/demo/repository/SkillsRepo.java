package com.backfranco.demo.repository;

import com.backfranco.demo.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills, Long> {
}
