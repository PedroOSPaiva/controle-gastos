package com.igreja.controle_gastos.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoDespesa tipo;

    private BigDecimal valor;

    private LocalDate dataPagamento;

    @Column(length = 500)
    private String observacao;

    @Lob
    private byte[] notaFiscal;

    // Relacionamento com usuário (opcional, dependendo dos requisitos)
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtores, getters e setters
    public Despesa() {}

    public Despesa(String descricao, TipoDespesa tipo, BigDecimal valor, LocalDate dataPagamento, String observacao, byte[] notaFiscal, Usuario usuario) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.observacao = observacao;
        this.notaFiscal = notaFiscal;
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

    public TipoDespesa getTipo() {
        return tipo;
    }

    public void setTipo(TipoDespesa tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public byte[] getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(byte[] notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
