package com.br.routine.controller;

import com.br.routine.model.tarefa.Tarefa;
import com.br.routine.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tarefa")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefa> getAll() {
        List<Tarefa> tarefas = tarefaRepository.findAll();

        System.out.println(tarefas);

        return tarefas;
    }

}
