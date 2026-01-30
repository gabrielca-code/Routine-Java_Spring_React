package com.br.routine.model.tarefa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Tarefa")
@Table(name = "tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private boolean ativa;

    public Tarefa() {}

    public Tarefa(TarefaAdicionarDTO dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void editar(TarefaEditarDTO dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
    }
}
