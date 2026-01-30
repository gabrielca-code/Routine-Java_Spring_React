package com.br.routine.controller;

import com.br.routine.model.tarefa.Tarefa;
import com.br.routine.model.tarefa.TarefaAdicionarDTO;
import com.br.routine.model.tarefa.TarefaEditarDTO;
import com.br.routine.model.tarefa.TarefaListagemDTO;
import com.br.routine.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<TarefaListagemDTO> listarTodasTarefas() {
        List<TarefaListagemDTO> tarefas = tarefaRepository.findAll().stream().map(TarefaListagemDTO::new).toList();

        return tarefas;
    }

    @PostMapping
    public void adicionarTarefa(@RequestBody @Valid TarefaAdicionarDTO dados) {
        var tarefa = new Tarefa(dados);

        tarefaRepository.save(tarefa);

        return;
    }

    @PutMapping
    public void editarTarefa(@RequestBody TarefaEditarDTO dados) {
        var tarefa = tarefaRepository.getReferenceById(dados.id());
        tarefa.editar(dados);

        return;
    }

    @DeleteMapping("/{id}")
    public void removerTarefa(@PathVariable Long id) {
        tarefaRepository.deleteById(id); //remoção física

        return;
    }

}
