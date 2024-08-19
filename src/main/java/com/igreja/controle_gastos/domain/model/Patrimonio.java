package com.igreja.controle_gastos.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Patrimonio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeItem;

    private BigDecimal valor;

    private LocalDate dataAquisicao;

    @Column(length = 500)
    private String observacao;

    @Lob
    private byte[] notaFiscal;

    // Relacionamento com usuário (opcional, dependendo dos requisitos)
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtores, getters e setters
    public Patrimonio() {}

    public Patrimonio(String nomeItem, BigDecimal valor, LocalDate dataAquisicao, String observacao, byte[] notaFiscal, Usuario usuario) {
        this.nomeItem = nomeItem;
        this.valor = valor;
        this.dataAquisicao = dataAquisicao;
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

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
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
