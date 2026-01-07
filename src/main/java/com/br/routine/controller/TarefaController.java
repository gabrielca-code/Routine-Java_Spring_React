package com.br.routine.controller;

import com.br.routine.model.tarefa.Tarefa;
import com.br.routine.model.tarefa.TarefaAdicionarDTO;
import com.br.routine.model.tarefa.TarefaListagemDTO;
import com.br.routine.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<TarefaListagemDTO> getAll() {
        List<TarefaListagemDTO> tarefas = tarefaRepository.findAll().stream().map(TarefaListagemDTO::new).toList();

        System.out.println(tarefas);

        return tarefas;
    }

    @PostMapping
    public void addTarefa(@RequestBody TarefaAdicionarDTO dados) {
        var tarefa = new Tarefa(dados);

        tarefaRepository.save(tarefa);
    }

}
