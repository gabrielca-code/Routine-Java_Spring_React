package com.br.routine.repository;

import com.br.routine.model.usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM usuario u WHERE u.ativa = true")
    Page<Usuario> findAllUsuarioAtivos(Pageable pageable);
}
