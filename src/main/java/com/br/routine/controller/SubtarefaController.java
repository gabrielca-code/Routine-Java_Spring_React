package com.br.routine.controller;

import com.br.routine.model.subtarefa.Subtarefa;
import com.br.routine.model.subtarefa.SubtarefaAdicionarDTO;
import com.br.routine.model.subtarefa.SubtarefaEditarDTO;
import com.br.routine.model.subtarefa.SubtarefaListagemDTO;
import com.br.routine.repository.SubtarefaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/subtarefa")
public class SubtarefaController {

    @Autowired
    SubtarefaRepository subtarefaRepository;

    @GetMapping("/{id}")
    public List<Subtarefa> listarTodasSubtarefas() {
        return subtarefaRepository.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity adicionarSubtarefa(@RequestBody @Valid SubtarefaAdicionarDTO dados, UriComponentsBuilder uriBuilder) {
        var subtarefa = new Subtarefa(dados);
        var subtarefaCriada = subtarefaRepository.save(subtarefa);

        var uri = uriBuilder.path("/subtarefa/{id}").buildAndExpand(subtarefaCriada.getId()).toUri();
        return ResponseEntity.created(uri).body(new SubtarefaListagemDTO(subtarefaCriada));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity removerSubtarefa(@PathVariable Long id) {
        subtarefaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity editarSubtarefa(@RequestBody @Valid  SubtarefaEditarDTO subtarefa) {
        var subtarefaAtual = subtarefaRepository.getReferenceById(subtarefa.id());
        subtarefaAtual.editar(subtarefa);

        return ResponseEntity.ok(subtarefaAtual);
    }

}