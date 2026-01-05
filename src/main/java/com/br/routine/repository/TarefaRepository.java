package com.br.routine.repository;

import com.br.routine.model.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> { }