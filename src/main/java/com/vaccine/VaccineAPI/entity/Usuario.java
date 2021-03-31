package com.vaccine.VaccineAPI.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.time.LocalDate;

@Entity
@Table


public class Usuario {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNome() {
        return nome;
    }

    public void setNome(long nome) {
        this.nome = nome;
    }

    public long getEmail() {
        return email;
    }

    public void setEmail(long email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private long id;
    private long nome;
    private long email;
    private long cpf;
    private LocalDate dataNascimento;
}
