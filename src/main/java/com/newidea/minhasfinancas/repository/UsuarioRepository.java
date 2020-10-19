package com.newidea.minhasfinancas.repository;

import com.newidea.minhasfinancas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
}
