package com.br.routine.model.subtarefa;

import com.br.routine.model.tarefa.Tarefa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "subtarefa")
@Table(name = "subtarefa")
public class Subtarefa {

    private Long id;
    private String titulo;
    private Tarefa tarefa;

    public Subtarefa() {}

    public Subtarefa(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void editar(SubtarefaEditarDTO subtarefa) {
        this.titulo = subtarefa.titulo();
    }
}
