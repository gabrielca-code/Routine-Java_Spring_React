package com.br.routine.controller;

import com.br.routine.model.usuario.Usuario;
import com.br.routine.model.usuario.UsuarioAdicionarDTO;
import com.br.routine.model.usuario.UsuarioListagemDTO;
import com.br.routine.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    public UsuarioListagemDTO obterUsuarioPeloId(@PathVariable Long id) {
        var usuario = usuarioRepository.getReferenceById(id);
        return new UsuarioListagemDTO(usuario);
    }

    @PostMapping
    public void adicionarUsuario(@RequestBody @Valid UsuarioAdicionarDTO dados) {
        var usuario = new Usuario(dados);
        usuarioRepository.save(usuario);
    }

    @PutMapping
    public void editarUsuario() {
        return;
    }

    @DeleteMapping
    public void removerUsuario() {
        return;
    }

}
