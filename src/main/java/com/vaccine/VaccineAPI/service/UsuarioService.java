package com.vaccine.VaccineAPI.service;

import com.vaccine.VaccineAPI.entity.Usuario;
import com.vaccine.VaccineAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findByEmail(String email) {
        Optional<Usuario> entity = Optional.ofNullable(usuarioRepository.findUsuarioByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("Usuario não identificado")));
        return entity.get();
    }
}
