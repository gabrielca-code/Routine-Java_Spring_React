package com.br.routine.controller;

import com.br.routine.model.subtarefa.Subtarefa;
import com.br.routine.repository.SubtarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}