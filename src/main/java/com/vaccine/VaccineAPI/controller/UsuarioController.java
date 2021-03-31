package com.vaccine.VaccineAPI.controller;

import com.vaccine.VaccineAPI.dto.UsuarioDTO;
import com.vaccine.VaccineAPI.entity.Usuario;
import com.vaccine.VaccineAPI.repository.UsuarioRepository;
import com.vaccine.VaccineAPI.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public UsuarioDTO create(@Valid @RequestBody UsuarioDTO usuario){
        return new UsuarioDTO(usuarioService.create(UsuarioDTO.converter(usuario)));
    }

}
