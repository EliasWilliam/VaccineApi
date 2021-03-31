package com.vaccine.VaccineAPI.service;

import com.vaccine.VaccineAPI.entity.Usuario;
import com.vaccine.VaccineAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
