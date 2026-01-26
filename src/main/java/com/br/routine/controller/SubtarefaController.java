package com.br.routine.controller;

import com.br.routine.model.subtarefa.Subtarefa;
import com.br.routine.model.subtarefa.SubtarefaEditarDTO;
import com.br.routine.repository.SubtarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subtarefa")
public class SubtarefaController {

    @Autowired
    SubtarefaRepository subtarefaRepository;

    @GetMapping
    public List<Subtarefa> listAllSubtarefas() {
        return subtarefaRepository.findAll();
    }

    @PostMapping
    public void addSubtarefa(@RequestBody Subtarefa subtarefa) {
        subtarefaRepository.save(subtarefa);
    }

    @DeleteMapping("/{id}")
    public void removerSubtarefa(@PathVariable Long id) {
        subtarefaRepository.deleteById(id);
    }

    @PutMapping
    public void editarSubtarefa(@RequestBody SubtarefaEditarDTO subtarefa) {
        var subtarefaAtual = subtarefaRepository.getReferenceById(subtarefa.id());
        subtarefaAtual.editar(subtarefa);
    }

}