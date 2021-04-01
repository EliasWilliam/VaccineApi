package com.vaccine.VaccineAPI.repository;

import com.vaccine.VaccineAPI.dto.VacinacaoDTO;
import com.vaccine.VaccineAPI.entity.Vacinacao;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}
