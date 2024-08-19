package com.igreja.controle_gastos.domain.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;

    private Integer quantidade;

    private LocalDate dataValidade;

    @Column(length = 500)
    private String observacao;

    // Relacionamento com usuário (opcional, dependendo dos requisitos)
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtores, getters e setters
    public Estoque() {}

    public Estoque(String nomeProduto, Integer quantidade, LocalDate dataValidade, String observacao, Usuario usuario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.observacao = observacao;
        this.usuario = usuario;
    }

    // Getters e Setters talvez usando LOMBOK fique menor.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
