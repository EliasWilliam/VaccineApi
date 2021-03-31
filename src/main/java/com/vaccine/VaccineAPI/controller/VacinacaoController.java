package com.vaccine.VaccineAPI.controller;


import com.vaccine.VaccineAPI.dto.VacinacaoDTO;
import com.vaccine.VaccineAPI.entity.Vacinacao;
import com.vaccine.VaccineAPI.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/vacinacao")

public class VacinacaoController {

    @Autowired
    VacinacaoService vacinacaoService;
    public ResponseEntity<VacinacaoDTO> create(@Valid @RequestBody VacinacaoDTO vacinacaoDTO, UriComponentsBuilder uriBuilder){
        VacinacaoDTO vacinacao = new VacinacaoDTO(VacinaoService.create(VacinacaoDTO.converter(vacinacaoDTO)));
        URI uri = uriBuilder.path("/vacincao/{id}").buildAndExpand(vacinacao.getId()).toUri();
        return ResponseEntity.created(uri).body(vacinacao);
    }

    }

