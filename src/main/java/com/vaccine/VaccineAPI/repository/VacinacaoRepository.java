package com.vaccine.VaccineAPI.repository;

import com.vaccine.VaccineAPI.dto.VacinacaoDTO;
import com.vaccine.VaccineAPI.entity.Vacinacao;

public class VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
    public static Vacinacao save(Vacinacao vacinacao) {
        return new VacinacaoDTO(VacinacaoRepository.save(VacinacaoDTO.converter(vacinacao)));
    }
}
