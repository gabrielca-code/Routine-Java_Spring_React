package com.br.routine.model;

import com.br.routine.dto.tarefa.TarefaAdicionarDTO;
import com.br.routine.dto.tarefa.TarefaEditarDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tarefa")
@Table(name = "tarefa")
public class Tarefa {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTarefa")
    private List<Subtarefa> subtarefas;
    private Boolean ativa;

    public Tarefa() {}

    public Tarefa(TarefaAdicionarDTO dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.usuario = dados.usuario();
        this.subtarefas = new ArrayList<Subtarefa>();
        this.ativa = true;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Subtarefa> getSubtarefas() {
        return subtarefas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void editar(TarefaEditarDTO dados) {
        if(dados.titulo() != null)
            this.titulo = dados.titulo();
        if(dados.descricao() != null)
            this.descricao = dados.descricao();
        if(dados.ativa() != null)
            this.ativa = dados.ativa();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void desativarTarefa() {
        this.ativa = false;
    }
}
