package com.igreja.controle_gastos.adapter.input.dto;


import com.igreja.controle_gastos.domain.model.UserRole;

public class UsuarioDTO {
    private Long id;
    private String login;
    private String nome;
    private UserRole role;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
