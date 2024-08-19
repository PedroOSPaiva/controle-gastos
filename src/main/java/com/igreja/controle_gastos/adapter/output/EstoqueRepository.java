package com.igreja.controle_gastos.adapter.output;

import com.igreja.controle_gastos.domain.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
