package com.br.routine.model.subtarefa;

import com.br.routine.model.tarefa.Tarefa;
import jakarta.persistence.*;

@Entity(name = "subtarefa")
@Table(name = "subtarefa")
public class Subtarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTarefa")
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
