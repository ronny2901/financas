package com.newidea.minhasfinancas.service.impl;

import com.newidea.minhasfinancas.exceptions.RegraNegocioException;
import com.newidea.minhasfinancas.model.entity.Usuario;
import com.newidea.minhasfinancas.repository.UsuarioRepository;
import com.newidea.minhasfinancas.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if(existe){
            throw new RegraNegocioException("Ja existe cadastro com este email");
        }
    }
}
