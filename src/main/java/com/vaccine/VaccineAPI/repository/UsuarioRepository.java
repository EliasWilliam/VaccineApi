package com.vaccine.VaccineAPI.repository;


//import br.com.azdev.VaccineAPIZUP.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vaccine.VaccineAPI.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    Optional<Usuario> findUsuarioByEmail(String email);
    }

