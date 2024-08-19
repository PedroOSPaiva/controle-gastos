package com.igreja.controle_gastos.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoReceita tipo;

    private BigDecimal valor;

    private LocalDate dataRecebimento;

    @Column(length = 500)
    private String observacao;

    // Relacionamento com usuário (opcional, dependendo dos requisitos)
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtores, getters e setters
    public Receita() {}

    public Receita(String descricao, TipoReceita tipo, BigDecimal valor, LocalDate dataRecebimento, String observacao, Usuario usuario) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
        this.dataRecebimento = dataRecebimento;
        this.observacao = observacao;
        this.usuario = usuario;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoReceita getTipo() {
        return tipo;
    }

    public void setTipo(TipoReceita tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(LocalDate dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
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
