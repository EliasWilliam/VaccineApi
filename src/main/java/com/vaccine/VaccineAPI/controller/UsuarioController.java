package com.vaccine.VaccineAPI.controller;

import com.vaccine.VaccineAPI.dto.UsuarioDTO;
import com.vaccine.VaccineAPI.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@Valid @RequestBody UsuarioDTO usuario,
                                             UriComponentsBuilder uriBuilder){
        UsuarioDTO usuarioDto =  new UsuarioDTO(usuarioService.create(UsuarioDTO.converter(usuario)));
        URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuarioDto.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDto);
    }

}
