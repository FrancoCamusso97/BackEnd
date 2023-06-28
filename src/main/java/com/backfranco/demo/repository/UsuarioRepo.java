package com.backfranco.demo.repository;

import com.backfranco.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
