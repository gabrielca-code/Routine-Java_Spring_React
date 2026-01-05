package com.br.routine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Tarefa")
public class TarefaController {

    @GetMapping
    public void getAll() {

    }

}
