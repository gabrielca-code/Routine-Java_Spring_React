package com.br.routine.controller;

import com.br.routine.model.tarefa.Tarefa;
import com.br.routine.model.tarefa.TarefaAdicionarDTO;
import com.br.routine.model.tarefa.TarefaEditarDTO;
import com.br.routine.model.tarefa.TarefaListagemDTO;
import com.br.routine.repository.TarefaRepository;
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
@RequestMapping("tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<Page<TarefaListagemDTO>> obterTodasTarefas(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacao) {
        var tarefas = tarefaRepository.findAll(paginacao).map(TarefaListagemDTO::new);

        return ResponseEntity.ok(tarefas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaListagemDTO> obterTarefa(@PathVariable Long id) {
        var tarefa = tarefaRepository.getReferenceById(id);
        return ResponseEntity.ok().body(new TarefaListagemDTO(tarefa));
    }

    @PostMapping
    @Transactional
    public ResponseEntity adicionarTarefa(@RequestBody @Valid TarefaAdicionarDTO dados, UriComponentsBuilder uriBuilder) {
        var tarefa = new Tarefa(dados);
        tarefaRepository.save(tarefa);

        var uri = uriBuilder.path("/tarefa/{id}").buildAndExpand(tarefa.getId()).toUri();

        return ResponseEntity.created(uri).body(new TarefaListagemDTO(tarefa));
    }

    @PutMapping
    @Transactional
    public ResponseEntity editarTarefa(@RequestBody @Valid TarefaEditarDTO dados) {
        var tarefa = tarefaRepository.getReferenceById(dados.id());
        tarefa.editar(dados);

        return ResponseEntity.ok(new TarefaListagemDTO(tarefa));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity removerTarefa(@PathVariable Long id) {
        tarefaRepository.deleteById(id); //remoção física

        return ResponseEntity.noContent().build();
    }

}
