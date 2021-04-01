package com.vaccine.VaccineAPI.controller;

import com.vaccine.VaccineAPI.entity.Vacinacao;

public class VacinaoService {

    public static void create(Vacinacao converter) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String nome;
    private String cpf;
    private String email;
}
