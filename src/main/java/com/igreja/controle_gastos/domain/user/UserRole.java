package com.igreja.controle_gastos.domain.user;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ADMIN("admin"),
    COORDENADOR("coordenador"),
    SECRETARIO("secretario"),
    TESOUREIRO("tesoureiro"),
    FIEL("fiel"),
    PADRE("padre");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    UserRole() {
        this.role = name().toLowerCase();
    }

    public String getRole() {
        return role;
    }

    @Override
    public String getAuthority() {
        return name();
    }

}
