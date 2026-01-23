package com.br.routine.controller;

import com.br.routine.model.usuario.UsuarioListagemDTO;
import com.br.routine.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    public UsuarioListagemDTO getUsuario(@PathVariable Long id) {
        var usuario = usuarioRepository.getReferenceById(id);
        return new UsuarioListagemDTO(usuario);
    }

}
