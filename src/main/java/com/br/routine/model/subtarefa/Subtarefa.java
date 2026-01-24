package com.br.routine.model.subtarefa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "subtarefa")
@Table(name = "subtarefa")
public class Subtarefa {

    private Long id;
    private String titulo;

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
}
