package com.vaccine.VaccineAPI.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Vacinacao {
    @Id @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public LocalDate getDataApalicao() {
        return dataApalicao;
    }

    public void setDataApalicao(LocalDate dataApalicao) {
        this.dataApalicao = dataApalicao;
    }

    private long id;
    private String nomeVacina;
    private String usuarioEmail;
    private LocalDate dataApalicao;
}
