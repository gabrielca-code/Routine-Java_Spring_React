package com.br.routine.model;

import com.br.routine.dto.subtarefa.SubtarefaAdicionarDTO;
import com.br.routine.dto.subtarefa.SubtarefaEditarDTO;
import jakarta.persistence.*;

@Entity(name = "subtarefa")
@Table(name = "subtarefa")
public class Subtarefa {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTarefa")
    private Tarefa tarefa;

    public Subtarefa() {}

    public Subtarefa(SubtarefaAdicionarDTO dados) {
        this.titulo = dados.titulo();
        this.tarefa = dados.tarefa();
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
