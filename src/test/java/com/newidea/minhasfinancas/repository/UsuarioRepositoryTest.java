package com.newidea.minhasfinancas.repository;

import com.newidea.minhasfinancas.model.entity.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class UsuarioRepositoryTest {

    @Autowired
    UsuarioRepository repository;

    @Test
    public void deveVerificarEmailExistente(){
        //cenario
        Usuario usuario = Usuario.builder()
                .email("email@email.com")
                .nome("Ronaldo")
                .build();
        repository.save(usuario);
        //execucao
        boolean result = repository.existsByEmail("email@email.com");

        //verificacao
        Assertions.assertThat(result).isTrue();
    }
}
