package com.br.routine.controller;

import com.br.routine.model.usuario.Usuario;
import com.br.routine.model.usuario.UsuarioAdicionarDTO;
import com.br.routine.model.usuario.UsuarioEditarDTO;
import com.br.routine.model.usuario.UsuarioListagemDTO;
import com.br.routine.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> obterUsuarioPeloId(@PathVariable Long id) {
        var usuario = usuarioRepository.getReferenceById(id);
        return ResponseEntity.ok(new UsuarioListagemDTO(usuario));
    }

    @GetMapping
    public ResponseEntity<Page<?>> listarTodosUsuarios(@PageableDefault(size = 10) Pageable paginacao) {
        var usuarios = usuarioRepository.findAllUsuarioAtivos(paginacao).map(UsuarioListagemDTO::new);
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> adicionarUsuario(@RequestBody @Valid UsuarioAdicionarDTO dados, UriComponentsBuilder uriBuilder) {
        var usuario = new Usuario(dados);
        usuarioRepository.save(usuario);

        var uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new UsuarioListagemDTO(usuario));
    }

    @PutMapping
    @Transactional
    public ResponseEntity<?> editarUsuario(@RequestBody @Valid UsuarioEditarDTO dados) {
        var usuario = usuarioRepository.getReferenceById(dados.id());
        usuario.editar(dados);

        return ResponseEntity.ok(new UsuarioListagemDTO(usuario));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> removerUsuario(@PathVariable Long id) {
        var usuario = usuarioRepository.getReferenceById(id);
        usuario.desativarUsuario();
        usuarioRepository.save(usuario); //remoção lógica

        return ResponseEntity.noContent().build();
    }

}
