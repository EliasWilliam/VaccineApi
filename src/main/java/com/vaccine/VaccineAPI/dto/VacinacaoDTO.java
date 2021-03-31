package com.vaccine.VaccineAPI.dto;

import com.vaccine.VaccineAPI.entity.Vacinacao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class VacinacaoDTO {

    private Long id;
    @NotBlank
    private String nomeVacina;
    @NotBlank @Email
    private String usuarioEmail;
    @NotNull
    private LocalDate dataAplicacao;

    public VacinacaoDTO (){
    }

    public VacinacaoDTO(Vacinacao vacinao){
        this.id = vacinao.getId();
        this.nomeVacina = vacinao.getNomeVacina();
        this.usuarioEmail = vacinao.getUsuarioEmail();
        this.dataAplicacao = vacinao.getDataApalicao();
    }

    public static Vacinacao converter(VacinacaoDTO vacinacaoDTO){
            Vacinacao vacinao = new Vacinacao();
            vacinao.setNomeVacina(vacinacaoDTO.getNomeVacina());
            vacinao.setUsuarioEmail(vacinacaoDTO.getUsuarioEmail());
            vacinao.setDataApalicao(vacinacaoDTO.getDataAplicacao);
             return vacinao;
}
