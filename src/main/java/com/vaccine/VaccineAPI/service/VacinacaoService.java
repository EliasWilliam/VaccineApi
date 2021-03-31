package com.vaccine.VaccineAPI.service;

import com.vaccine.VaccineAPI.entity.Vacinacao;
import com.vaccine.VaccineAPI.repository.VacinacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinacaoService {

    @Autowired
    VacinacaoRepository vacinacaoRepository;

    public Vacinacao create(Vacinacao vacinacao){
        return vacinacaoRepository.save(vacinacao);
    }
}
