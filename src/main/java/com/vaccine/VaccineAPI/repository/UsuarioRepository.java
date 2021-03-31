package com.vaccine.VaccineAPI.repository;

import com.vaccine.VaccineAPI.entity.Usuario;

public class UsuarioRepository extends JpaRepository <Usuario,Long> {
    public Usuario save(Usuario usuario) {
        return usuario;
    }
}
