package com.br.routine.repository;

import com.br.routine.model.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    @Query("SELECT * FROM tarefa t WHERE t.ativa = 1")
    List<Tarefa> obterTarefasAtivas();

}