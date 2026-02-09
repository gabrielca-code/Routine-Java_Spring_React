package com.br.routine.repository;

import com.br.routine.model.tarefa.Tarefa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    @Query("SELECT t FROM tarefa t WHERE t.ativa = true")
    Page<Tarefa> obterTarefasAtivas(Pageable pageable);

}