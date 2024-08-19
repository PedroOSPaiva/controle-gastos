package com.igreja.controle_gastos.adapter.output;

import com.igreja.controle_gastos.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
